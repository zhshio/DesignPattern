package edu.zhshio.factory.course.practice;/**
 * @Auther: 张帅
 * @Date: 2024/2/29 - 02 - 29 - 11:09
 * @Description: edu.zhshio.factory.course
 * @version: 1.0
 */

import edu.zhshio.factory.course.practice.support.Job;


/**
 * @description:
 * @author: zs
 * @time: 2024/2/29 11:09
 */

public class JobFactory {

    public static Job assignJob(String type) throws IllegalAccessException {
        if (type.toLowerCase().equals("screw")) {
            return new Screw();
        } else if (type.toLowerCase().equals("facemask")) {
            return new FaceMask();
        } else if (type.toLowerCase().equals("phone")) {
            return new Phone();
        } else {
            throw new IllegalAccessException("不存在该类型电视");
        }
    }
}
