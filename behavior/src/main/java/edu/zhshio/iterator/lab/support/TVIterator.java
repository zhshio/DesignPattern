package edu.zhshio.iterator.lab.support;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午6:12
 */

public interface TVIterator {

    void setChannel(int i);

    void next();

    void previous();

    boolean isLast();

    Object currentChannel();

    boolean isFirst();
}
