package edu.zhshio.factorymethod.practice.test;/**
 * @Auther: 张帅
 * @Date: 2024/3/4 - 03 - 04 - 15:24
 * @Description: edu.zhshio.factorymethod.practice.test
 * @version: 1.0
 */

import edu.zhshio.factorymethod.practice.suppoort.Pizza;
import edu.zhshio.factorymethod.practice.suppoort.PizzaFactory;
import edu.zhshio.factorymethod.practice.util.XMLUtilPizza;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/4 15:24
 */

public class Test {
    public static void main(String[] args) {
        String pizzaFacotryPackagePath = XMLUtilPizza.getPizzaFactoryName();
        try {
            Class<?> clazz = Class.forName(pizzaFacotryPackagePath);
            PizzaFactory pizzaFactory = (PizzaFactory) clazz.newInstance();
            Pizza pizza = pizzaFactory.getPizza();
            pizza.producePizza();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
