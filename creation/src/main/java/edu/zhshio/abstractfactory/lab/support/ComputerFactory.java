package edu.zhshio.abstractfactory.lab.support;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/20 20:32
 */

public interface ComputerFactory {
    CPU produceCPU();
    RAM produceRAM();
}
