package edu.zhshio.singleton;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/10 下午9:46
 */

import edu.zhshio.singleton.lab.multiton.Mutiton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MutitonTest {

    @Test
    public void testGetInstance() {
        // 测试用例1: 获取同一个name的实例，预期返回相同的实例
        Mutiton instance1 = Mutiton.getInstance("TestName");
        Mutiton instance2 = Mutiton.getInstance("TestName");
        Assertions.assertSame(instance1, instance2);

        // 测试用例2: 获取不同name的实例，预期返回不同的实例
        Mutiton instance3 = Mutiton.getInstance("AnotherName");
        Assertions.assertNotSame(instance1, instance3);
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        // 测试用例1: 克隆应抛出CloneNotSupportedException
        Mutiton instance = Mutiton.getInstance("TestName");
        Assertions.assertThrows(CloneNotSupportedException.class, () -> instance.clone());
    }

    @Test
    public void testReadResolve() throws ObjectStreamException {
        // 测试用例1: 序列化解析应返回相同的实例
        Mutiton instance1 = Mutiton.getInstance("TestName");
        ObjectInputStream ois = null;
        try {
            // 创建模拟的序列化和反序列化流程
            byte[] serialized = serialize(instance1);
            ois = new ObjectInputStream(new ByteArrayInputStream(serialized));
            Mutiton instance2 = (Mutiton) ois.readObject();
            Assertions.assertSame(instance1, instance2);
        } catch (Exception e) {
            Assertions.fail("Serializing or deserializing failed.", e);
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (Exception e) {
                    // Ignore
                }
            }
        }
    }

    // 辅助方法，用于序列化对象
    private byte[] serialize(Object obj) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(obj);
        return bos.toByteArray();
    }

    // 辅助方法，用于反序列化对象
    private Object deserialize(byte[] bytes) throws Exception {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }


    @Test
    public void testPrivateConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        String testName = "TestName";
        // 创建实例
        Mutiton.getInstance(testName);
        // 获取私有构造函数
        Constructor<Mutiton> constructor = Mutiton.class.getDeclaredConstructor(String.class);

        // 设置构造函数为可访问
        constructor.setAccessible(true);

        // 尝试直接通过反射创建新实例
        Assertions.assertThrows(RuntimeException.class, () -> {
            try {
                constructor.newInstance(testName);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        });

    }

    @Test
    public void testConstructors() throws Exception {

    }
}
