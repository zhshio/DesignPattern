package edu.zhshio.observer.lab;

import edu.zhshio.observer.lab.investors.Here;
import edu.zhshio.observer.lab.investors.IndividualInvestors;
import edu.zhshio.observer.lab.investors.MarketMaker;
import edu.zhshio.observer.lab.stock.Stock;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午7:38
 */

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Stock stockA = new Stock("A股", 2800);
        Here here = new Here();
        IndividualInvestors individualInvestors = new IndividualInvestors();
        MarketMaker marketMaker = new MarketMaker();

        stockA.attach(here);
        stockA.attach(individualInvestors);
        stockA.attach(marketMaker);

        System.out.println("第一次开盘");
        stockA.setPrice(2899);
        TimeUnit.SECONDS.sleep(3);
        System.out.println("第二次开盘");
        stockA.setPrice(2300);
    }
}
