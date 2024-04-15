package edu.zhshio.iterator.lab;

import edu.zhshio.iterator.lab.support.TVIterator;
import edu.zhshio.iterator.lab.support.Television;
import edu.zhshio.iterator.lab.utils.XMLUtil;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午6:45
 */

public class Client {
    public static void main(String[] args) {
        Television tv = (Television) XMLUtil.getBean();
        display(tv);
        System.out.println("--------------------");
        reverseDisplay(tv, 8);
    }

    public static void display(Television tv) {
        TVIterator i = tv.createIterator();
        System.out.println("正序遍历电视频道:");
        while (!i.isLast()) {
            System.out.println(i.currentChannel().toString());
            i.next();
        }
    }

    public static void reverseDisplay(Television tv, int last) {
        TVIterator i = tv.createIterator();
        System.out.println("从第" + last + "个频道, 开始逆序遍历电视频道:");
        i.setChannel(last);
        while (!i.isFirst()) {
            i.previous();
            System.out.println(i.currentChannel().toString());
        }
    }
}
