package edu.zhshio.two;

import edu.zhshio.two.informer.MeetingList;
import edu.zhshio.two.observers.Department;
import edu.zhshio.two.observers.Employee;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午9:14
 */

public class Client {
    public static void main(String[] args) {

        Employee employee1 = new Employee("员工小赵");
        Employee employee2 = new Employee("员工小李");
        Employee employee3 = new Employee("员工小刘");
        Employee employee4 = new Employee("员工小王");
        Employee employee5 = new Employee("张总");

        Department developmentDepartment = new Department("技术部");
        developmentDepartment.addEmployee(employee1);
        developmentDepartment.addEmployee(employee2);
        Department productDepartment = new Department("产品部");
        productDepartment.addEmployee(employee3);
        productDepartment.addEmployee(employee4);

        MeetingList meetingList = new MeetingList();
        meetingList.attach(employee5);
        meetingList.attach(developmentDepartment);
        meetingList.attach(productDepartment);

        meetingList.inform("会议将于 2024年4月14日 晚上20:00 准时开始");
        System.out.println("\n");
        meetingList.inform("会议开始, 请尽快进入会议");
        System.out.println("\n");
        meetingList.inform("会议结束");

    }
}
