package yyd.phoebe.creation.factory.abstractfactory;

/**
 * 抽象工厂模式
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        FactoryBuilder factoryBuilder = new FactoryBuilder();

        AbstractFactory color = factoryBuilder.build("COLOR");
        Color red = color.getColor("RED");
        red.fill();

        AbstractFactory shape = factoryBuilder.build("SHAPE");
        Shape square = shape.getShape("SQUARE");
        square.draw();
    }
}
