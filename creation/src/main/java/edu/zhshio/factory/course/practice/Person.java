package edu.zhshio.factory.course.practice;
/**
 * @Auther: 张帅
 * @Date: 2024/2/29 - 02 - 29 - 11:43
 * @Description: edu.zhshio.factory.course.practice
 * @version: 1.0
 */


import edu.zhshio.factory.course.practice.support.Job;

/**
 * @description:
 * @author: zs
 * @time: 2024/2/29 11:43
 */

public class Person {

    private String name;

    private Job job;

    public void work() {
        job.work();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
