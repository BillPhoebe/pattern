package yyd.phoebe.struct.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class DynamicProxyDemo {

    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject();
        Subject proxy = proxySubject.bind();
        proxy.sellBooks();
        proxy.speak();
    }
}
