package edu.zhshio.observer.lab.investors;

import edu.zhshio.observer.lab.support.Investor;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午7:36
 */

public class MarketMaker implements Investor {
    @Override
    public void upDate() {
        System.out.println("庄家: 又能狠狠割一笔韭菜,变一波现了");
    }
}
