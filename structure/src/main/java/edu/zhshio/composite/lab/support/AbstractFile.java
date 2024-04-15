package edu.zhshio.composite.lab.support;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 上午10:48
 */

public abstract class AbstractFile {

    private String name;

    public abstract void display();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractFile(String name) {
        this.name = name;
    }
}