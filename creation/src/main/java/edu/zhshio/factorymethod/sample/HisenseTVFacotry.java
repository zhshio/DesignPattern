package edu.zhshio.factorymethod.sample;/**
 * @Auther: 张帅
 * @Date: 2024/3/4 - 03 - 04 - 14:38
 * @Description: edu.zhshio.factorymethod
 * @version: 1.0
 */

import edu.zhshio.factorymethod.sample.support.TV;
import edu.zhshio.factorymethod.sample.support.TVFactory;

/**
 * @description:
 * @author: zs
 * @time: 2024/3/4 14:38
 */

public class HisenseTVFacotry implements TVFactory {
    @Override
    public TV produceTV() {
        return new HisenseTV();
    }
}
