package edu.zhshio.builder;/**
 * @Auther: 张帅
 * @Date: 2024/3/7 - 03 - 07 - 11:01
 * @Description: edu.zhshio.builder
 * @version: 1.0
 */

import com.sun.tools.javac.Main;
import edu.zhshio.builder.director.Director;
import edu.zhshio.builder.support.AbstractMealBuilder;
import edu.zhshio.builder.util.XMLUtil;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/7 11:01
 */

public class Test {
    public static void main(String[] args) throws Exception {
        Director director = new Director();
        director.setBuilder((AbstractMealBuilder) XMLUtil.getBean());
        Meal meal = director.constrcut();
        System.out.println(meal);


    }
}
