package edu.zhshio.builder;/**
 * @Auther: 张帅
 * @Date: 2024/3/7 - 03 - 07 - 10:47
 * @Description: edu.zhshio.builder
 * @version: 1.0
 */

/**
 * @description:
 * @author: zs
 * @time: 2024/3/7 10:47
 */

public class Meal {

    private String food;
    private String drink;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "food='" + food + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
