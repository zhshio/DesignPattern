package edu.zhshio.adapter.lab;

import edu.zhshio.adapter.lab.adaptee.ConcreteCat;
import edu.zhshio.adapter.lab.adaptee.ConcreteDog;
import edu.zhshio.adapter.lab.adapter.DoubleAdapter;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 上午10:40
 */

public class Client {
    public static void main(String[] args) {
        DoubleAdapter doubleAdapter = new DoubleAdapter();
        doubleAdapter.setCat(new ConcreteCat());
        doubleAdapter.setDog(new ConcreteDog());

        doubleAdapter.cry();
        doubleAdapter.catchMouse();
        doubleAdapter.wang();
        doubleAdapter.action();
    }
}
