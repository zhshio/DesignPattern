package edu.zhshio.abstractfactory.lab;

import edu.zhshio.abstractfactory.lab.support.CPU;
import edu.zhshio.abstractfactory.lab.support.ComputerFactory;
import edu.zhshio.abstractfactory.lab.support.RAM;
import edu.zhshio.abstractfactory.lab.util.XMLUtil;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午8:09
 */

public class Client {
    public static void main(String[] args) {
        ComputerFactory computerFactory = (ComputerFactory) XMLUtil.getBean();
        CPU cpu = computerFactory.produceCPU();
        RAM ram = computerFactory.produceRAM();

        cpu.run();
        ram.save();
    }
}
