package edu.zhshio.factorymethod.practice;/**
 * @Auther: 张帅
 * @Date: 2024/3/4 - 03 - 04 - 15:15
 * @Description: edu.zhshio.factorymethod.practice
 * @version: 1.0
 */

import edu.zhshio.factorymethod.practice.suppoort.AbstractPizza;
import edu.zhshio.factorymethod.practice.suppoort.Pizza;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/4 15:15
 */

public class GreekPizza extends AbstractPizza {
    @Override
    public void prePare() {
        System.out.println("准备: " + GreekPizza.class.getName());
    }

    @Override
    public void bake() {
        System.out.println("烘焙: " + GreekPizza.class.getName());
    }

    @Override
    public void cut() {
        System.out.println("切割: " + GreekPizza.class.getName());
    }

    @Override
    public void box() {
        System.out.println("打包: " + GreekPizza.class.getName());
    }

}
