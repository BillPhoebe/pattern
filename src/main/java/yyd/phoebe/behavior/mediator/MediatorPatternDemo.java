package yyd.phoebe.behavior.mediator;

/**
 * 中介者模式
 * IOC的目标
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("john");
        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
