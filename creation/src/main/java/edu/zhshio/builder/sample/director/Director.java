package edu.zhshio.builder.director;/**
 * @Auther: 张帅
 * @Date: 2024/3/7 - 03 - 07 - 10:55
 * @Description: edu.zhshio.builder.director
 * @version: 1.0
 */

import edu.zhshio.builder.ConcreteMealBuilderA;
import edu.zhshio.builder.Meal;
import edu.zhshio.builder.support.AbstractMealBuilder;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/7 10:55
 */

public class Director {
    private AbstractMealBuilder builder;


    public Meal constrcut() {
        return builder.build()
                    .buildFood()
                    .buildDrink()
                    .finished();

    }


    public void setBuilder(AbstractMealBuilder builder) {
        this.builder = builder;
    }
}
