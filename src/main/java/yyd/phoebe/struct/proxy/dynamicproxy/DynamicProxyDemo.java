package yyd.phoebe.struct.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class DynamicProxyDemo {

    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);
        Subject proxy = (Subject)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, myInvocationHandler);
        proxy.sellBooks();
        proxy.speak();
    }
}
