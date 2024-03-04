package edu.zhshio.factorymethod.practice;/**
 * @Auther: 张帅
 * @Date: 2024/3/4 - 03 - 04 - 15:28
 * @Description: edu.zhshio.factorymethod.practice
 * @version: 1.0
 */

import edu.zhshio.factorymethod.practice.suppoort.Pizza;
import edu.zhshio.factorymethod.practice.suppoort.PizzaFactory;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/4 15:28
 */

public class GreekPizzaFacotry implements PizzaFactory {
    @Override
    public Pizza getPizza() {
        return new GreekPizza();
    }
}
