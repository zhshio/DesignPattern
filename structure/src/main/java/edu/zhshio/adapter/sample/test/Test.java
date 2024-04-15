package edu.zhshio.adapter.sample.test;/**
 * @Auther: 张帅
 * @Date: 2024/3/13 - 03 - 13 - 8:59
 * @Description: edu.zhshio.adapter.sample.test
 * @version: 1.0
 */

import edu.zhshio.adapter.sample.Dog;
import edu.zhshio.adapter.sample.DogAdapter;
import edu.zhshio.adapter.sample.Robot;
import edu.zhshio.adapter.sample.util.XMLUtil;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/13 8:59
 */

public class Test {
    public static void main(String[] args) {
        Robot robot =(DogAdapter)XMLUtil.getBean();
        robot.cry();
        robot.move();
    }
}
