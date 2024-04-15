package edu.zhshio.observer.lab.investors;

import edu.zhshio.observer.lab.support.Investor;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午7:38
 */

public class Here implements Investor {
    @Override
    public void upDate() {
        System.out.println("大户:  大家抓紧机会抄底, 牛市要来啦");
    }
}
