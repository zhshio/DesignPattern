package edu.zhshio.factorymethod.sample;/**
 * @Auther: 张帅
 * @Date: 2024/3/4 - 03 - 04 - 14:46
 * @Description: edu.zhshio.factorymethod
 * @version: 1.0
 */

import edu.zhshio.factorymethod.sample.support.TV;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/4 14:46
 */

public class XiaoMiTV implements TV {
    @Override
    public void display() {
        System.out.println("小米电视正在显像");
    }
}
