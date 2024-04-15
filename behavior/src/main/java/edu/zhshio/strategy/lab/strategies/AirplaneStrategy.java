package edu.zhshio.strategy.lab.strategies;

import edu.zhshio.strategy.lab.support.TravelStrategy;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午7:53
 */

public class AirplaneStrategy implements TravelStrategy {
    @Override
    public void travel() {
        System.out.println("飞机旅游, 就是一个快!");
    }
}
