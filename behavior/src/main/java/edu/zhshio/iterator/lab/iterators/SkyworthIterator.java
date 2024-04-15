package edu.zhshio.iterator.lab.iterators;

import edu.zhshio.iterator.lab.support.TVIterator;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午6:31
 */

public class SkyworthIterator implements TVIterator {

    private final Object[] objs;

    private int cur;


    @Override
    public void setChannel(int i) {
        if (i > objs.length) {
            throw new RuntimeException("越界警告, 设置失败");
        }
        this.cur = i;
    }

    @Override
    public void next() {
        if (cur < objs.length) {
            cur++;
        }
    }

    @Override
    public void previous() {
        if (cur > 0) {
            cur--;
        }
    }

    @Override
    public boolean isLast() {
        return cur == objs.length;
    }

    @Override
    public Object currentChannel() {
        return objs[cur];
    }

    @Override
    public boolean isFirst() {
        return cur == 0;
    }

    public SkyworthIterator(Object[] objs) {
        this.objs = objs;
        cur = 0;
    }

}
