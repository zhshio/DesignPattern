package edu.zhshio.factory.course.sample.test;/**
 * @Auther: 张帅
 * @Date: 2024/2/29 - 02 - 29 - 11:12
 * @Description: edu.zhshio.factory.course.test
 * @version: 1.0
 */

import edu.zhshio.factory.course.sample.TVFactory;
import edu.zhshio.factory.course.sample.support.TV;
import edu.zhshio.factory.course.sample.util.XMLUtilTV;

/**
 * @description:
 * @author: zs
 * @time: 2024/2/29 11:12
 */

public class Test {
    public static void main(String[] args) {
        String tvType = XMLUtilTV.getBrandName();
        try {
            TV tv = TVFactory.produceTV(tvType);
            tv.display();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
