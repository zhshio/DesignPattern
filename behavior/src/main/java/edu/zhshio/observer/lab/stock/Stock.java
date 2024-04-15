package edu.zhshio.observer.lab.stock;

import edu.zhshio.observer.lab.support.Investor;


import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午7:20
 */

public class Stock {

    private List<Investor> observers;

    private String stockName;
    private double price;

    public void attach(Investor investor) {
        observers.add(investor);
    }

    public void datch(Investor investor) {
        observers.removeIf(observer -> investor.equals(observer));
    }

    public void notifyInvestor() {
        observers.stream()
                .forEach(observer -> {
                    observer.upDate();
                });
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        double change = Math.abs(price - this.price);
        System.out.println(stockName + ": " + this.price + " -> " + price);
        if (change >= price * 5e-2) {
            System.out.println("------------众生象------------");
            notifyInvestor();
            System.out.println("-----------------------------");
        }
        this.price = price;
    }

    public Stock(String stockName, double price) {
        this.observers = new LinkedList<>();
        this.stockName = stockName;
        this.price = price;
    }
}
