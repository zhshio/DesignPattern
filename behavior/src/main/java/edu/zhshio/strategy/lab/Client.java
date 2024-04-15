package edu.zhshio.strategy.lab;

import edu.zhshio.strategy.lab.support.TravelStrategy;
import edu.zhshio.strategy.lab.travelers.Person;
import edu.zhshio.strategy.lab.util.XMLUtil;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午8:02
 */

public class Client {
    public static void main(String[] args) {
        TravelStrategy travelStrategy = (TravelStrategy) XMLUtil.getBean();
        Person person = new Person(travelStrategy);
        person.travel();
    }
}
