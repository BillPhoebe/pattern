package yyd.phoebe.creation.factory.abstractfactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        switch (shape){
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            case "CIRCLE":
                return new Circle();
            default:
                throw new RuntimeException("no this shape");
        }
    }
}
