package edu.zhshio.factorymethod.sample;/**
 * @Auther: 张帅
 * @Date: 2024/2/29 - 02 - 29 - 11:07
 * @Description: edu.zhshio.factory.course
 * @version: 1.0
 */


import edu.zhshio.factorymethod.sample.support.TV;

/**
 * @description:
 * @author: zs
 * @time: 2024/2/29 11:07
 */

public class Haier implements TV {
    @Override
    public void display() {
        System.out.println("海尔电视正在显像");
    }
}
