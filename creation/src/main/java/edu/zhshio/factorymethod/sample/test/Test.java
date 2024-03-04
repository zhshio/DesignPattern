package edu.zhshio.factorymethod.sample.test;/**
 * @Auther: 张帅
 * @Date: 2024/2/29 - 02 - 29 - 11:12
 * @Description: edu.zhshio.factory.course.test
 * @version: 1.0
 */

import edu.zhshio.factorymethod.sample.support.TV;
import edu.zhshio.factorymethod.sample.support.TVFactory;
import edu.zhshio.factorymethod.sample.util.XMLUtilTV;

/**
 * @description:
 * @author: zs
 * @time: 2024/2/29 11:12
 */

public class Test {
    public static void main(String[] args) {
        String FactoryType = XMLUtilTV.getBrandName();
        System.out.println(FactoryType);
        try {
            Class<?> aClass = Class.forName(FactoryType);
            TVFactory factory = (TVFactory) aClass.newInstance();
            TV tv = factory.produceTV();
            tv.display();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
}
