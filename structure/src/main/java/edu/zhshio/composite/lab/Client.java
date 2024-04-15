package edu.zhshio.composite.lab;

import edu.zhshio.composite.lab.files.ImageFile;
import edu.zhshio.composite.lab.files.TextFile;
import edu.zhshio.composite.lab.files.VedioFile;
import edu.zhshio.composite.lab.folder.Folder;


/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午5:14
 */

public class Client {
    public static void main(String[] args) {
        Folder folder = new Folder("files");
        Folder subfolder = new Folder("subfiles");

        ImageFile image = new ImageFile("tyut.img");
        VedioFile vedio = new VedioFile("tyut.mp3");
        TextFile text = new TextFile("tyut.txt");

        ImageFile image2 = new ImageFile("tyut2.img");
        VedioFile vedio2 = new VedioFile("tyut2.mp3");
        TextFile text2 = new TextFile("tyut2.txt");

        subfolder.addFile(image2);
        subfolder.addFile(vedio2);
        subfolder.addFile(text2);

        folder.addFile(subfolder);
        folder.addFile(image);
        folder.addFile(vedio);
        folder.addFile(text);

        folder.display();

    }
}
