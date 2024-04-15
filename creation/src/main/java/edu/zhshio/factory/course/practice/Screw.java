package edu.zhshio.factory.course.practice;

import edu.zhshio.factory.course.practice.support.Job;


/**
 * @description:
 * @author: zs
 * @time: 2024/2/29 11:07
 */

public class Screw implements Job {


    @Override
    public void work() {
        System.out.println("打螺丝");
    }
}
