package edu.zhshio.singleton.lab;

import edu.zhshio.singleton.lab.multiton.Mutiton;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/10 下午10:38
 */

public class Client {
    public static void main(String[] args) {
        Mutiton instance1 = Mutiton.getInstance("实例1");
        Mutiton instance2 = Mutiton.getInstance("实例2");
        Mutiton instance3 = Mutiton.getInstance("实例3");

        Mutiton instance11 = Mutiton.getInstance("实例1");
        Mutiton instance22 = Mutiton.getInstance("实例2");
        Mutiton instance33 = Mutiton.getInstance("实例3");

        System.out.println(instance1 == instance11);
        System.out.println(instance2 == instance22);
        System.out.println(instance3 == instance33);

    }
}
