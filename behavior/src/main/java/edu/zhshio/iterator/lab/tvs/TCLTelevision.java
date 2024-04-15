package edu.zhshio.iterator.lab.tvs;

import edu.zhshio.iterator.lab.iterators.TCLIterator;
import edu.zhshio.iterator.lab.support.TVIterator;
import edu.zhshio.iterator.lab.support.Television;

/**
 * @description:
 * @author: zs
 * @time: 2024/4/14 下午6:18
 */

public class TCLTelevision implements Television {

    private Object[] objs = {
            "湖南卫视",
            "北京卫视",
            "上海卫视",
            "湖北卫视",
            "黑龙江卫视",
            "山西卫视",
            "山东卫视",
            "广西卫视",
            "广东卫视"
    };

    @Override
    public TVIterator createIterator() {
        return new TCLIterator(objs);
    }

}
