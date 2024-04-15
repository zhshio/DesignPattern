package edu.zhshio.strategy.lab.strategies;

import edu.zhshio.strategy.lab.support.TravelStrategy;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午7:54
 */

public class BicycleStrategy implements TravelStrategy {
    @Override
    public void travel() {
        System.out.println("自行车游, 绿色环保");
    }
}
