package yyd.phoebe.struct.proxy;

/**
 * 代理模式
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("abc.txt");

        image.display();
        System.out.println();
        image.display();
    }
}
