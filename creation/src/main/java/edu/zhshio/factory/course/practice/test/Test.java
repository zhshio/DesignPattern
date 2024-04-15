package edu.zhshio.factory.course.practice.test;/**
 * @Auther: 张帅
 * @Date: 2024/2/29 - 02 - 29 - 11:12
 * @Description: edu.zhshio.factory.course.test
 * @version: 1.0
 */

import edu.zhshio.factory.course.practice.JobFactory;
import edu.zhshio.factory.course.practice.Person;

import edu.zhshio.factory.course.practice.support.Job;
import edu.zhshio.factory.course.practice.util.XMLUtilTV;


/**
 * @description:
 * @author: zs
 * @time: 2024/2/29 11:12
 */

public class Test {
    public static void main(String[] args) {
        String jobType = XMLUtilTV.getBrandName();
        Person person = new Person();

        try {
            Job job = JobFactory.assignJob(jobType);
            person.setJob(job);

            person.work();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
