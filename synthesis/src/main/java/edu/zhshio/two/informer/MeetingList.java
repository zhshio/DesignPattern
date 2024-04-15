package edu.zhshio.two.informer;


import edu.zhshio.two.support.Informer;

import edu.zhshio.two.support.Observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午9:06
 */

public class MeetingList implements Informer {

    private List<Observer> observers;

    private String message;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void datch(Observer Observer) {
        observers.removeIf(observer -> Observer.equals(observer));
    }

    @Override

    public void inform(String message) {
        observers.stream()
                .forEach(observer -> {
                    observer.accept(message);
                });
    }


    public MeetingList() {
        this.observers = new LinkedList<>();
    }
}
