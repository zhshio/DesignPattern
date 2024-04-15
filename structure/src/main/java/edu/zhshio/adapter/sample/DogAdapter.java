package edu.zhshio.adapter.sample;/**
 * @Auther: 张帅
 * @Date: 2024/3/13 - 03 - 13 - 8:54
 * @Description: edu.zhshio.adapter
 * @version: 1.0
 */

/**
 * @description:
 * @author: zs
 * @time: 2024/3/13 8:54
 */

public class DogAdapter extends Dog implements Robot{
    public void cry() {
        System.out.println("机器人模仿");
        super.wang();
    }

    public void move() {
        System.out.println("机器人模仿");
        super.run();
    }
}
