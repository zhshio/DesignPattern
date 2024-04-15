package edu.zhshio.strategy.lab.travelers;

import edu.zhshio.strategy.lab.support.TravelStrategy;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午7:58
 */

public class Person {
    private TravelStrategy travelStrategy;

    public void travel() {
        System.out.println("我要去旅游啦");
        travelStrategy.travel();
    }

    public TravelStrategy getTravelStrategy() {
        return travelStrategy;
    }

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public Person(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public Person() {
    }
}
