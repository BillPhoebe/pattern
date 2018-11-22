package yyd.phoebe.creation.factory;

public class ShapeFactory {

    public Shape getShape(ShapeTypeEnum type){
        switch (type){
            case Rectangle:
                return new Rectangle();
            case Square:
                return new Square();
            case Circle:
                return new Circle();
            default:
                throw new RuntimeException("no this shape");
        }
    }
}
