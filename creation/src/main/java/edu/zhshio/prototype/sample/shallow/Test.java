package edu.zhshio.prototype.sample;/**
 * @Auther: 张帅
 * @Date: 2024/3/11 - 03 - 11 - 14:18
 * @Description: edu.zhshio.prototype.sample
 * @version: 1.0
 */

import javax.management.NotificationEmitter;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/11 14:18
 */

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Email email = new Email("你好啊");
        Email copyEmail = (Email) email.clone();
        System.out.println(email);
        System.out.println(copyEmail);
        System.out.println(email.getContent());
        System.out.println(copyEmail.getContent());
        System.out.println(email == copyEmail);
        System.out.println(email.getContent() == copyEmail.getContent());
    }
}
