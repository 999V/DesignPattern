package org.design.pattern.structural.facade;

/**
 * 圆
 *
 * @author zhengxin
 * @date 2022/11/23
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
