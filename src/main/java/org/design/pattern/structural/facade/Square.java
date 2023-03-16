package org.design.pattern.structural.facade;

/**
 * 正方形
 *
 * @author zhengxin
 * @date 2022/11/23
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
