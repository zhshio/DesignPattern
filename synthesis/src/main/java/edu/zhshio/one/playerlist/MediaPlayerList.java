package edu.zhshio.one.playerlist;

import edu.zhshio.one.api.MediaPlayerAPI;
import edu.zhshio.one.support.PlayerList;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午8:31
 */

public class MediaPlayerList implements PlayerList {

    public MediaPlayerAPI mediaplayerAPI;

    public MediaPlayerList() {

        mediaplayerAPI=new MediaPlayerAPI();

    }



    @Override

    public void player() {

        System.out.println("MediaPlayerList");

    }

}