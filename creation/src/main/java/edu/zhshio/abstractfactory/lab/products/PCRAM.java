package edu.zhshio.abstractfactory.lab.products;

import edu.zhshio.abstractfactory.lab.support.RAM;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/20 20:34
 */

public class PCRAM implements RAM {
    @Override
    public void save() {
        System.out.println("PC RAM is saving......");
    }
}
