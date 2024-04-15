package edu.zhshio.one;

import edu.zhshio.one.support.MainWindow;
import edu.zhshio.one.support.PlayerFactory;
import edu.zhshio.one.support.PlayerList;
import edu.zhshio.one.util.XMLUtil;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午8:37
 */

public class ClientClass {

    public static void main(String[] args) {


        PlayerFactory playerFactory= (PlayerFactory) XMLUtil.getBean();

        MainWindow mainWindow = playerFactory.createMainWindow();

        mainWindow.window();

        PlayerList playerList = playerFactory.createPlayerList();

        playerList.player();

    }

}

