package org.design.pattern.structural.facade;

/**
 * 门面模式演示
 *
 * @author zhengxin
 * @date 2022/11/23
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();

        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();
    }
}
