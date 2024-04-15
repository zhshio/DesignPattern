package edu.zhshio.two.observers;

import edu.zhshio.two.support.Observer;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午8:57
 */

public class Employee extends Observer {

    public Employee(String name) {
        super(name);
    }

    @Override
    public void accept(String message) {
        System.out.println(getName() + "  接收到会议消息:" + message);
    }
}
