package org.design.pattern.structural.facade;

/**
 * 矩形
 *
 * @author zhengxin
 * @date 2022/11/23
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
