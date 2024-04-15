package edu.zhshio.one.playerfactory;

import edu.zhshio.one.mainwindow.RealPlayerWindow;
import edu.zhshio.one.playerlist.RealPlayerList;
import edu.zhshio.one.support.MainWindow;
import edu.zhshio.one.support.PlayerFactory;
import edu.zhshio.one.support.PlayerList;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午8:30
 */

public class RealPlayerFactory implements PlayerFactory {

    @Override

    public MainWindow createMainWindow(){

        return new RealPlayerWindow();

    }

    @Override

    public PlayerList createPlayerList(){

        return new RealPlayerList();

    }

}