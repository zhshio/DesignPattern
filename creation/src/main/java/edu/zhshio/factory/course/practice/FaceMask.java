package edu.zhshio.factory.course.practice;
/**
 * @Auther: 张帅
 * @Date: 2024/2/29 - 02 - 29 - 11:08
 * @Description: edu.zhshio.factory.course
 * @version: 1.0
 */


import edu.zhshio.factory.course.practice.support.Job;

/**
 * @description:
 * @author: zs
 * @time: 2024/2/29 11:08
 */

public class FaceMask implements Job {
    @Override
    public void work() {
        System.out.println("做口罩");
    }
}
