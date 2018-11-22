package yyd.phoebe.struct.facade;

/**
 * 外观模式
 * 整合功能资源，简化使用
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();
    }
}
