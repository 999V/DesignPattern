package org.design.pattern.structural.facade;

/**
 * 外观形状
 *
 * @author zhengxin
 * @date 2022/11/23
 */
public class ShapeFacade {
    private Shape rectangle;
    private Shape square;
    private Shape circle;

    public ShapeFacade() {
        rectangle = new Rectangle();
        square = new Square();
        circle = new Circle();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawCircle() {
        circle.draw();
    }
}
