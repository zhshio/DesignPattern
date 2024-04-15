package edu.zhshio.two.support;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午8:49
 */

public abstract class Observer {


    private String name;

    public abstract void accept(String message);

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Observer(String name) {
        this.name = name;
    }
}
