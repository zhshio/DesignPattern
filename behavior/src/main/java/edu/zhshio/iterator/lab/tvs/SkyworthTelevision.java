package edu.zhshio.iterator.lab.tvs;

import edu.zhshio.iterator.lab.iterators.SkyworthIterator;
import edu.zhshio.iterator.lab.support.TVIterator;
import edu.zhshio.iterator.lab.support.Television;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午6:17
 */

public class SkyworthTelevision implements Television {

    private Object[] objs = {
            "CCTV-1",
            "CCTV-2",
            "CCTV-3",
            "CCTV-4",
            "CCTV-5",
            "CCTV-6",
            "CCTV-7",
            "CCTV-8"
    };
    @Override
    public TVIterator createIterator() {
        return new SkyworthIterator(objs);
    }

}
