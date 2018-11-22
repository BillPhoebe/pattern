package yyd.phoebe.creation.factory.abstractfactory;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        switch (color){
            case "RED":
                return new Red();
            case "GREEN":
                return new Green();
            case "BLUE":
                return new Blue();
            default:
                throw new RuntimeException("no this color");
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
