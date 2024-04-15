package edu.zhshio.composite.lab.files;

import edu.zhshio.composite.lab.support.AbstractFile;


/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 上午10:53
 */

public class ImageFile extends AbstractFile {

    @Override
    public void display() {
        System.out.println("图片显示");
    }

    public ImageFile(String name) {
        super(name);
    }

}
