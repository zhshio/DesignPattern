package edu.zhshio.observer.lab.investors;

import edu.zhshio.observer.lab.support.Investor;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午7:35
 */

public class IndividualInvestors implements Investor {

    @Override
    public void upDate() {
        System.out.println("散户:  完了, 又要被割韭菜啦");
    }
}
