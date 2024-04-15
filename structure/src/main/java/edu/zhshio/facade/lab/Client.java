package edu.zhshio.facade.lab;

import com.sun.tools.javac.Main;
import edu.zhshio.facade.lab.facade.Mainframe;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午5:57
 */

public class Client {
    public static void main(String[] args) {
        Mainframe mainframe = new Mainframe();
        mainframe.on();
    }
}
