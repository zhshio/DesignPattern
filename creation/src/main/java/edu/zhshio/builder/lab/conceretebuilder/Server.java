package edu.zhshio.builder.lab.conceretebuilder;

import edu.zhshio.builder.lab.support.AbstractComputerBuilder;
import edu.zhshio.builder.lab.support.Computer;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/10 下午8:02
 */

public class Server extends AbstractComputerBuilder {

    String concereteCategory = "服务器";

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
        this.computer.setDisk(concereteCategory + "硬盘");
        return this;
    }

    @Override
    public AbstractComputerBuilder assembleHost() {
        this.computer.setHost(concereteCategory + "主机箱");
        return this;
    }

    @Override
    public AbstractComputerBuilder assembleDisplya() {
        this.computer.setDisplay(concereteCategory + "显示器");
        return this;
    }

    @Override
    public Computer finish() {
        return this.computer;
    }
}
