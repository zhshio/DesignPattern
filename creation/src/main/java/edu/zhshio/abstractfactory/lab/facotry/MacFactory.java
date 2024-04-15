package edu.zhshio.abstractfactory.lab.facotry;


import edu.zhshio.abstractfactory.lab.products.MacCPU;
import edu.zhshio.abstractfactory.lab.products.MacRAM;
import edu.zhshio.abstractfactory.lab.support.CPU;
import edu.zhshio.abstractfactory.lab.support.ComputerFactory;
import edu.zhshio.abstractfactory.lab.support.RAM;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/20 20:36
 */

public class MacFactory implements ComputerFactory {
    @Override
    public CPU produceCPU() {
        return new MacCPU();
    }

    @Override
    public RAM produceRAM() {
        return new MacRAM();
    }
}
