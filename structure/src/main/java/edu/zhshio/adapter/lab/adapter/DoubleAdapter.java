package edu.zhshio.adapter.lab.adapter;

import edu.zhshio.adapter.lab.support.Cat;
import edu.zhshio.adapter.lab.support.Dog;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 上午10:16
 */

public class DoubleAdapter implements Dog, Cat {

    private Dog dog;
    private Cat cat;

    @Override
    public void cry() {
        cat.cry();
    }

    @Override
    public void catchMouse() {
        cat.catchMouse();
    }

    @Override
    public void wang() {
        dog.wang();
    }

    @Override
    public void action() {
        dog.action();
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public DoubleAdapter(Dog dog, Cat cat) {
        this.dog = dog;
        this.cat = cat;
    }

    public DoubleAdapter() {
    }
}
