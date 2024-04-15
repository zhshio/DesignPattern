package edu.zhshio.singleton;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/10 下午10:11
 */

import edu.zhshio.singleton.lab.multiton.Mutiton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class MutitonConcurrencyTest {

    private static final int THREAD_COUNT = 1000;
    private static final String TEST_NAME = "TestName";
    private static final String ANOTHER_NAME = "AnotherName";


    @Test
    public void testMultiThreadedInstanceAccess() throws InterruptedException, ExecutionException, NoSuchFieldException, IllegalAccessException {
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);

        List<Future<Mutiton>> futures = new ArrayList<>();

        for (int i = 0; i < THREAD_COUNT; i++) {
            if (i % 2 == 0) {
                futures.add((Future<Mutiton>) executorService.submit(() -> {


                    Assertions.assertThrows(RuntimeException.class, () -> {
                        try {
                            Mutiton instance = Mutiton.getInstance(TEST_NAME);
                            // 获取私有构造函数
                            Constructor<Mutiton> constructor = Mutiton.class.getDeclaredConstructor(String.class);
                            // 设置构造函数为可访问
                            constructor.setAccessible(true);
                            instance =  constructor.newInstance(TEST_NAME);
                            } catch (NoSuchMethodException e) {
                                throw new RuntimeException(e);
                            } catch (InstantiationException e) {
                                throw new RuntimeException(e);
                            } catch (IllegalAccessException e) {
                                throw new RuntimeException(e);
                            } catch (InvocationTargetException e) {
                                throw new RuntimeException(e);
                            }

                    });
                    return Mutiton.getInstance(TEST_NAME);

                }));
            } else {
                futures.add((Future<Mutiton>) executorService.submit(() -> {
                    Assertions.assertThrows(RuntimeException.class, () -> {
                        try {
                            Mutiton instance = Mutiton.getInstance(ANOTHER_NAME);
                            // 获取私有构造函数
                            Constructor<Mutiton> constructor = Mutiton.class.getDeclaredConstructor(String.class);
                            // 设置构造函数为可访问
                            constructor.setAccessible(true);
                            instance =  constructor.newInstance(ANOTHER_NAME);
                        } catch (NoSuchMethodException e) {
                            throw new RuntimeException(e);
                        } catch (InstantiationException e) {
                            throw new RuntimeException(e);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        } catch (InvocationTargetException e) {
                            throw new RuntimeException(e);
                        }

                    });
                    return Mutiton.getInstance(ANOTHER_NAME);
                }));
            }
        }

        // 等待所有线程完成
        executorService.shutdown();
        assertTrue(executorService.awaitTermination(5, TimeUnit.SECONDS));

        // 验证所有线程返回的实例是否唯一且正确
        List<Mutiton> instances = new ArrayList<>();
        for (Future<Mutiton> future : futures) {
            Mutiton mutiton = future.get();
            instances.add(mutiton);
        }

        assertEquals(THREAD_COUNT / 2, instances.stream().filter(i -> i.getName().equals(TEST_NAME)).count());
        assertEquals(THREAD_COUNT / 2, instances.stream().filter(i -> i.getName().equals(ANOTHER_NAME)).count());

        // 验证具有相同name的所有实例实际上是同一个对象
        List<Mutiton> testNameInstances = instances.stream()
                .filter(i -> i.getName().equals(TEST_NAME))
                .collect(Collectors.toList());
        List<Mutiton> anotherNameInstances = instances.stream()
                .filter(i -> i.getName().equals(ANOTHER_NAME))
                .collect(Collectors.toList());

        assertTrue(testNameInstances.stream().allMatch(i -> i == testNameInstances.get(0)));
        assertTrue(anotherNameInstances.stream().allMatch(i -> i == anotherNameInstances.get(0)));

        // 验证实例缓存中是否存在预期的实例
        Map<String, Mutiton> instanceCache =getInstanceCache();
        assertEquals(2, instanceCache.size());
        assertTrue(instanceCache.containsKey(TEST_NAME));
        assertTrue(instanceCache.containsKey(ANOTHER_NAME));
        assertSame(instanceCache.get(TEST_NAME), testNameInstances.get(0));
        assertSame(instanceCache.get(ANOTHER_NAME), anotherNameInstances.get(0));
    }

    // 辅助方法，用于获取Mutiton类的静态实例缓存字段
    private static Map<String, Mutiton> getInstanceCache() throws IllegalAccessException, NoSuchFieldException {
        Field field = null;
        try {
            field = Mutiton.class.getDeclaredField("instanceCache");
            field.setAccessible(true);
            return (Map<String, Mutiton>) field.get(null);
        } finally {
            if (field != null) {
                field.setAccessible(false);
            }
        }
    }

}
