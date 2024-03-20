package edu.zhshio.builder.support;/**
 * @Auther: 张帅
 * @Date: 2024/3/7 - 03 - 07 - 10:47
 * @Description: edu.zhshio.builder.support
 * @version: 1.0
 */

import edu.zhshio.builder.Meal;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/7 10:47
 */

public abstract class AbstractMealBuilder {

    protected Meal meal;

    public abstract AbstractMealBuilder build();

    public abstract AbstractMealBuilder buildFood();

    public abstract AbstractMealBuilder buildDrink();

    public abstract Meal finished();
}
