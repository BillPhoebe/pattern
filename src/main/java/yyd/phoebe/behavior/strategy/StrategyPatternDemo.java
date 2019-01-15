package yyd.phoebe.behavior.strategy;

/**
 * 策略模式
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context("Add");
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context("Subtract");
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context("Multiply");
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
