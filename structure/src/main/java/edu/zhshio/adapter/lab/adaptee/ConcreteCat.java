package edu.zhshio.adapter.lab.adaptee;

import edu.zhshio.adapter.lab.support.Cat;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 上午10:14
 */

public class ConcreteCat implements Cat {
    @Override
    public void cry() {
        System.out.println("猫叫");
    }

    @Override
    public void catchMouse() {
        System.out.println("捉老鼠");
    }
}
