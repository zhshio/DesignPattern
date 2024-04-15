package edu.zhshio.abstractfactory.lab.products;
import edu.zhshio.abstractfactory.lab.support.RAM;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/20 20:35
 */

public class MacRAM implements RAM {
    @Override
    public void save() {
        System.out.println("Mac RAM is saving");
    }
}
