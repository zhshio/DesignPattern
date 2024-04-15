package edu.zhshio.two.observers;

import edu.zhshio.two.support.Observer;

import java.util.Map;
import java.util.TreeMap;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午8:59
 */

public class Department extends Observer {


    private Map<String, Observer> subFiles = new TreeMap<>();

    @Override
    public void accept(String message) {
        String departmentName = getName();
        System.out.println("---------------------" + departmentName + "---------------------");
        subFiles.values()
                .stream()
                .forEach(
                        observer ->{
                            observer.accept(message);
                        }
                );
    }

    public void addEmployee(Employee employee) {
        subFiles.put(employee.getName(), employee);
    }

    public void removeEmployee(Employee employee) {
        subFiles.remove(employee.getName());
    }


    public Department(String name) {
        super(name);
    }
}
