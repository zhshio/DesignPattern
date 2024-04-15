package edu.zhshio.builder.practice.director;/**
*@Auther: 张帅
*@Date: 2024/3/7 - 03 - 07 - 11:38 
*@Description: edu.zhshio.builder.practice.director
*@version: 1.0 
*/

import edu.zhshio.builder.practice.support.Computer;
import edu.zhshio.builder.practice.support.AbstractComputerBuilder;

/**
 * @description: 
 * @author: zs
 * @time: 2024/3/7 11:38
 */
 
public class ComputerAssembleDirector {

    AbstractComputerBuilder computerBuilder;

    public Computer assemble() {
        return computerBuilder
                    .assembleCPU()
                    .assembleMemory()
                    .assembleDisk()
                    .assembleHost()
                    .assembleDisplya()
                    .finish();
    }

    public ComputerAssembleDirector(AbstractComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void setComputerBuilder(AbstractComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }
}
