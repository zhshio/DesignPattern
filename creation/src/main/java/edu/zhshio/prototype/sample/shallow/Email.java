package edu.zhshio.prototype.sample;/**
 * @Auther: 张帅
 * @Date: 2024/3/11 - 03 - 11 - 14:17
 * @Description: edu.zhshio.prototype.sample
 * @version: 1.0
 */

/**
 * @description:
 * @author: zs
 * @time: 2024/3/11 14:17
 */

public class Email implements Cloneable{

    String content;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Email(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
