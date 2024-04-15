package edu.zhshio.abstractfactory.lab.facotry;

import edu.zhshio.abstractfactory.lab.products.PCCPU;
import edu.zhshio.abstractfactory.lab.products.PCRAM;
import edu.zhshio.abstractfactory.lab.support.CPU;
import edu.zhshio.abstractfactory.lab.support.ComputerFactory;
import edu.zhshio.abstractfactory.lab.support.RAM;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/20 20:36
 */

public class PCFactory implements ComputerFactory {
    @Override
    public CPU produceCPU() {
        return new PCCPU();
    }

    @Override
    public RAM produceRAM() {
        return new PCRAM();
    }
}
