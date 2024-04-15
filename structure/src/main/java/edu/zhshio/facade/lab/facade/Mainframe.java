package edu.zhshio.facade.lab.facade;

import edu.zhshio.facade.lab.accessories.CPU;
import edu.zhshio.facade.lab.accessories.HardDisk;
import edu.zhshio.facade.lab.accessories.Memory;
import edu.zhshio.facade.lab.accessories.OS;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午5:54
 */


public class Mainframe {

    private CPU cpu;

    private HardDisk hardDisk;

    private Memory memory;

    private OS os;

    public Mainframe() {
        this.cpu = new CPU();
        this.hardDisk = new HardDisk();
        this.memory = new Memory();
        this.os = new OS();
    }

    public void on() {
        System.out.println("电脑启动中...");
        try {
            memory.check();
            cpu.run();
            hardDisk.read();
            os.load();
            System.out.println("电脑成功启动.");
        } catch (Exception e) {
            System.out.println("电脑成功失败.");
            throw new RuntimeException(e);
        }
    }

}
