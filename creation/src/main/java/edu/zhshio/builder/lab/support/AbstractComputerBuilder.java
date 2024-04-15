package edu.zhshio.builder.practice.support;/**
*@Auther: 张帅
*@Date: 2024/3/7 - 03 - 07 - 11:31 
*@Description: edu.zhshio.builder.practice.support
*@version: 1.0 
*/

/**
 * @description: 
 * @author: zs
 * @time: 2024/3/7 11:31
 */
 
public abstract class AbstractComputerBuilder {

    protected Computer computer = new Computer();

    public abstract AbstractComputerBuilder assembleCPU();

    public abstract AbstractComputerBuilder assembleMemory();

    public abstract AbstractComputerBuilder assembleDisk();

    public abstract AbstractComputerBuilder assembleHost();

    public abstract AbstractComputerBuilder assembleDisplya();

    public abstract Computer finish();
}
