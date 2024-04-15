package edu.zhshio.composite.lab.files;

import edu.zhshio.composite.lab.support.AbstractFile;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 上午10:58
 */

public class VedioFile extends AbstractFile {

    @Override
    public void display() {
        System.out.println("播放视频");
    }

    public VedioFile(String name) {
        super(name);
    }

}
