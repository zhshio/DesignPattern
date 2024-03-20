package edu.zhshio.builder;/**
 * @Auther: 张帅
 * @Date: 2024/3/7 - 03 - 07 - 10:53
 * @Description: edu.zhshio.builder
 * @version: 1.0
 */

import edu.zhshio.builder.support.AbstractMealBuilder;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/7 10:53
 */

public class ConcreteMealBuilderB extends AbstractMealBuilder {
    @Override
    public AbstractMealBuilder build() {
        meal = new Meal();
        return this;
    }

    @Override
    public AbstractMealBuilder buildFood() {
        meal.setFood("鸡肉卷");
        return this;
    }

    @Override
    public AbstractMealBuilder buildDrink() {
        meal.setDrink("豆浆");
        return this;
    }

    @Override
    public Meal finished() {
        return meal;
    }
}
