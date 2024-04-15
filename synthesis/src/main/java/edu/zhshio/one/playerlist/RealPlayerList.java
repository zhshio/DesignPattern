package edu.zhshio.one.playerlist;

import edu.zhshio.one.api.RealPlayerAPI;
import edu.zhshio.one.support.PlayerList;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午8:31
 */

public class RealPlayerList implements PlayerList {

    private RealPlayerAPI  realplayerAPI=new RealPlayerAPI();

    public RealPlayerList(){

        realplayerAPI = new RealPlayerAPI();

    }

    @Override

    public void player() {

        System.out.println("RealPlayerList");

    }

}