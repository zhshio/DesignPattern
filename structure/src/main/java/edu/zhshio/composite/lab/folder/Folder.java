package edu.zhshio.composite.lab.folder;

import edu.zhshio.composite.lab.support.AbstractFile;

import java.util.*;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 上午11:02
 */

public class Folder extends AbstractFile {

    private Map<String, AbstractFile> subFiles = new TreeMap<>();

    @Override
    public void display() {
        String folderName = getName();
        System.out.println(folderName);
        String spaces = generateSpace(folderName.length());
        subFiles.values()
                .stream()
                .forEach(
                        file ->{
                            if (file instanceof Folder) {
                                System.out.print(spaces + "|");
                                System.out.print("--");
                                file.display();
                            } else {
                                System.out.println(spaces + "|");
                                System.out.println(spaces + "--" + file.getName());
                            }
                        }
                );
    }

    public void addFile(AbstractFile file) {
        if (subFiles.containsKey(file.getName())) {
            throw new RuntimeException("不可在同一文件夹中创建相同名字的文件");
        }
        subFiles.put(file.getName(), file);
    }

    public void removeFile(AbstractFile file) {
        subFiles.remove(file.getName());
    }

    private String generateSpace(int length) {
        StringBuilder sb = new StringBuilder();
        while (length-- > 0) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public Folder(String name) {
        super(name);
    }

}
