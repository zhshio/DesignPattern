package edu.zhshio.adapter.lab.adaptee;

import edu.zhshio.adapter.lab.support.Dog;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 上午10:14
 */

public class ConcreteDog implements Dog {
    @Override
    public void wang() {
        System.out.println("狗叫");
    }

    @Override
    public void action() {
        System.out.println("狗刨");
    }
}
