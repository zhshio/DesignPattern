package edu.zhshio.factorymethod.practice.suppoort;/**
 * @Auther: 张帅
 * @Date: 2024/3/4 - 03 - 04 - 15:17
 * @Description: edu.zhshio.factorymethod.practice.suppoort
 * @version: 1.0
 */

/**
 * @description:
 * @author: zs
 * @time: 2024/3/4 15:17
 */

public abstract class AbstractPizza implements Pizza{
    @Override
    public final void producePizza() {
        prePare();
        bake();
        cut();
        box();
    }

    public abstract void prePare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();
}
