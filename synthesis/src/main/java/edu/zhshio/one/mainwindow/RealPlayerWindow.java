package edu.zhshio.one.mainwindow;

import edu.zhshio.one.api.RealPlayerAPI;
import edu.zhshio.one.support.MainWindow;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午8:34
 */

public class RealPlayerWindow implements MainWindow {

    private RealPlayerAPI realplayerAPI=new RealPlayerAPI();


    @Override

    public void window() {

        System.out.println("RealPlayerWindow");

    }

}
