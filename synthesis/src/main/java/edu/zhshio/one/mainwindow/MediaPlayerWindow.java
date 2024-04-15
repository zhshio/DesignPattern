package edu.zhshio.one.mainwindow;

import edu.zhshio.one.api.MediaPlayerAPI;
import edu.zhshio.one.support.MainWindow;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午8:34
 */

public class MediaPlayerWindow implements MainWindow {

    public MediaPlayerAPI mediaplayerAPI;

    public MediaPlayerWindow() {

        mediaplayerAPI=new MediaPlayerAPI();

    }


    @Override

    public void window() {

        System.out.println("MediaPlayerWindow");

    }

}

