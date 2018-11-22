package yyd.phoebe.creation.factory;

/**
 * 工厂模式
 * 创建具有同样功能，但是具有多种不同实现方式的东西。
 * 简单工厂 工厂 抽象工厂
 * 同一种思路，抽象程度不同，酌情选择
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape(ShapeTypeEnum.Rectangle);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(ShapeTypeEnum.Square);
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(ShapeTypeEnum.Circle);
        shape3.draw();
    }
}
