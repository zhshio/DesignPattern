package edu.zhshio.factorymethod.sample;/**
 * @Auther: 张帅
 * @Date: 2024/2/29 - 02 - 29 - 11:08
 * @Description: edu.zhshio.factory.course
 * @version: 1.0
 */


import edu.zhshio.factorymethod.sample.support.TV;

/**
 * @description:
 * @author: zs
 * @time: 2024/2/29 11:08
 */

public class HisenseTV implements TV {

    @Override
    public void display() {
        System.out.println("海森四电视正在显像");
    }
}
