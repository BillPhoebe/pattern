package yyd.phoebe.creation.factory.abstractfactory;

public class FactoryBuilder {

    public AbstractFactory build(String factory){
        switch (factory){
            case "COLOR":
                return new ColorFactory();
            case "SHAPE":
                return new ShapeFactory();
            default:
                throw new RuntimeException("no this factory");
        }
    }
}
