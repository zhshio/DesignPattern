package edu.zhshio.builder.practice.conceretebuilder;/**
*@Auther: 张帅
*@Date: 2024/3/7 - 03 - 07 - 11:35
*@Description: edu.zhshio.builder.practice
*@version: 1.0
*/

import edu.zhshio.builder.practice.support.AbstractComputerBuilder;
import edu.zhshio.builder.practice.support.Computer;

/**
 * @description: 
 * @author: zs
 * @time: 2024/3/7 11:35
 */
 
public class Desktop extends AbstractComputerBuilder {

    String concereteCategory = "台式机";

    @Override
    public AbstractComputerBuilder assembleCPU() {
        this.computer.setCPU(concereteCategory + "CPU");
        return this;
    }

    @Override
    public AbstractComputerBuilder assembleMemory() {
        this.computer.setMemory(concereteCategory + "内存");
        return this;
    }

    @Override
    public AbstractComputerBuilder assembleDisk() {
        this.computer.setMemory(concereteCategory + "硬盘");
        return this;
    }

    @Override
    public AbstractComputerBuilder assembleHost() {
        this.computer.setMemory(concereteCategory + "主机箱");
        return this;
    }

    @Override
    public AbstractComputerBuilder assembleDisplya() {
        this.computer.setMemory(concereteCategory + "显示器");
        return this;
    }

    @Override
    public Computer finish() {
        return this.computer;
    }
}
