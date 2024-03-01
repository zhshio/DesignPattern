package edu.zhshio.factory.course.sample;/**
 * @Auther: 张帅
 * @Date: 2024/2/29 - 02 - 29 - 11:09
 * @Description: edu.zhshio.factory.course
 * @version: 1.0
 */

import edu.zhshio.factory.course.sample.Haier;
import edu.zhshio.factory.course.sample.HisenseTV;
import edu.zhshio.factory.course.sample.support.TV;

/**
 * @description:
 * @author: zs
 * @time: 2024/2/29 11:09
 */

public class TVFactory {

    public static TV produceTV(String type) throws IllegalAccessException {
        if (type.equals("Hisense")) {
            return new HisenseTV();
        } else if (type.equals("Haier")) {
            return new Haier();
        } else {
            throw new IllegalAccessException("不存在该类型电视");
        }
    }
}
