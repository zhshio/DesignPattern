package edu.zhshio.strategy.lab.strategies;

import edu.zhshio.strategy.lab.support.TravelStrategy;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午7:53
 */

public class TrainStrategy implements TravelStrategy {
    @Override
    public void travel() {
        System.out.println("火车旅游, 别忘了欣赏沿途的风景");
    }
}
