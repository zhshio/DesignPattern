package edu.zhshio.singleton.lab.multiton;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;



/**
 * @description:
 * @author: zs
 * @time: 2024/4/10 下午8:24
 */

public class Mutiton implements Cloneable, Serializable {

    // volatile保持可见性, ConcurrentHashMap保证并发下Map内部状态一致性
    private static volatile Map<String, Mutiton> instanceCache = new ConcurrentHashMap<>();
    // 观察调用了几次构造方法
    // private static AtomicInteger count = new AtomicInteger(0);
    private String name;

    private Mutiton(String name) {

        // 假如instanceCache中不存在实例, 反射可以创建对象, 在创建后仍然会放到instanceCache中, 不会破坏单例模式
        // 主要是预防反射重复创建对象
        if (!instanceCache.isEmpty() && instanceCache.containsKey(name)) {
            // 防止反射破坏单例模式
            throw new RuntimeException("Mutiton 被设计为单例 不可重复实例化");
        }
        // 不会产生死锁, 因为synchronized是可重入的
        synchronized (Mutiton.class) {
            if (!instanceCache.isEmpty() && instanceCache.containsKey(name)) {
                // 双重检查锁, 防止并发场景下反射破坏单例模式
                throw new RuntimeException("Mutiton 被设计为单例 不可重复实例化");
            }
            // 观察调用了几次构造方法
            //  System.out.println(count.addAndGet(1));
            this.name = name;
            instanceCache.put(name, this);
        }

    }


    // 为什么重复写两段双重检查锁逻辑? 因为getInstance在发现已存在单例时是返回单例, 而构造方法则是直接抛出异常, 逻辑不可重用
    public static Mutiton getInstance(String name) {
        // 双重检查锁, 防止并发场景下破坏单例模式
        if (instanceCache.isEmpty() || !instanceCache.containsKey(name)) {
            synchronized (Mutiton.class) {
                if (instanceCache.isEmpty() || !instanceCache.containsKey(name)) {
                    Mutiton mutiton = new Mutiton(name);
                }
            }
        }
        return instanceCache.get(name);
    }



    // 防止克隆破坏单例模式
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Mutiton 被设计为单例, 不可以clone");
    }

    // 防止序列化破坏单例模式
    private Object readResolve() throws ObjectStreamException {
        return getInstance(this.name);
    }

    public String getName() {
        return this.name;
    }


}
