package edu.zhshio.abstractfactory.lab.products;

import edu.zhshio.abstractfactory.lab.support.CPU;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/20 20:34
 */

public class MacCPU implements CPU {
    @Override
    public void run() {
        System.out.println("Mac cpu is running");
    }
}
