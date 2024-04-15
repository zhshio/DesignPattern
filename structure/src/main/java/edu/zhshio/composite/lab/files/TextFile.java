package edu.zhshio.composite.lab.files;

import edu.zhshio.composite.lab.support.AbstractFile;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 上午11:01
 */

public class TextFile extends AbstractFile {

    @Override
    public void display() {
        System.out.println("展示文本");
    }

    public TextFile(String name) {
        super(name);
    }
}
