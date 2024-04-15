package edu.zhshio.builder.practice.support;/**
*@Auther: 张帅
*@Date: 2024/3/7 - 03 - 07 - 11:31 
*@Description: edu.zhshio.builder.practice
*@version: 1.0 
*/ /**
 * @description: 
 * @author: zs
 * @time: 2024/3/7 11:31
 */
 
public class Computer {

    private String cpu;

    private String memory;

    private String disk;

    private String host;

    private String display;

    public String getCPU() {
        return cpu;
    }

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", disk='" + disk + '\'' +
                ", host='" + host + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
