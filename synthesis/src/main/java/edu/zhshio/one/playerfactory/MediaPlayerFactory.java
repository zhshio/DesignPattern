package edu.zhshio.one.playerfactory;

import edu.zhshio.one.mainwindow.MediaPlayerWindow;
import edu.zhshio.one.playerlist.MediaPlayerList;
import edu.zhshio.one.support.MainWindow;
import edu.zhshio.one.support.PlayerFactory;
import edu.zhshio.one.support.PlayerList;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午8:35
 */

public class MediaPlayerFactory implements PlayerFactory {

    @Override

    public MainWindow createMainWindow(){

        return new MediaPlayerWindow();

    }

    @Override

    public PlayerList createPlayerList(){

        return new MediaPlayerList();

    }

}
