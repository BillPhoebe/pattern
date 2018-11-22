package yyd.phoebe.struct.bridge;

/**
 * 桥接模式
 * 使抽象和实现可以独立的变化，比如直接继承就不行。
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Circle redCircle = new Circle(100, 100, 10, new RedCircle());
        Circle greenCircle = new Circle(100, 100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
