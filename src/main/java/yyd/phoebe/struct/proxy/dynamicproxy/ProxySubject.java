package yyd.phoebe.struct.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxySubject implements InvocationHandler {

    private Subject realSubject;

    public Subject bind(){
        this.realSubject=new RealSubject();
        return (Subject)Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理类");
        switch (method.getName()) {
            case "sellBooks": {
                int invoke = (int) method.invoke(realSubject, args);
                System.out.println("调用的是卖书的方法");
                return invoke;
            }
            case "speak": {
                String invoke = (String) method.invoke(realSubject, args);
                System.out.println("调用的是说话的方法");
                return invoke;
            }
            default:
                throw new RuntimeException("no this method");
        }
    }
}
