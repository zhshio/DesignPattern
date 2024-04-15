package edu.zhshio.abstractfactory.lab.products;

import edu.zhshio.abstractfactory.lab.support.CPU;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/20 20:33
 */

public class PCCPU implements CPU {
    @Override
    public void run() {
        System.out.println("PC CPU is running...");
    }
}
