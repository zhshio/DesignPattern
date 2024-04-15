package edu.zhshio.strategy.lab.strategies;

import edu.zhshio.strategy.lab.support.TravelStrategy;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午7:57
 */

public class WalkStrategy implements TravelStrategy {
    @Override
    public void travel() {
        System.out.println("徒步行走, 跨越山和大海!");
    }
}
