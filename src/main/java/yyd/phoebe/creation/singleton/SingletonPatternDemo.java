package yyd.phoebe.creation.singleton;

/**
 * 单例模式
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        Object1.getInstance().hello();
        Object2.getInstance3().hello();
        Object3.getInstance().hello();
        Object4.INSTANCE.hello();
    }
}

/**
 * 饿汉式
 */
class Object1{
    private static Object1 instance=new Object1();
    private Object1(){}
    public static Object1 getInstance(){
        return instance;
    }
    public void hello(){
        System.out.println("hello world");
    }
}
/**
 * 懒汉式
 */
class Object2{
    private static Object2 instance;
    private Object2(){}
    //线程不安全
    public static Object2 getInstance1(){
        if (instance==null){
            instance=new Object2();
        }
        return instance;
    }
    //线程安全但效率低
    public static synchronized Object2 getInstance2(){
        if (instance==null){
            instance=new Object2();
        }
        return instance;
    }
    //双重校验锁
    public static Object2 getInstance3(){
        if (instance==null){
            synchronized (Object2.class){
                if (instance==null){
                    instance=new Object2();
                }
            }
        }
        return instance;
    }
    public void hello(){
        System.out.println("hello world");
    }
}
/**
 * 静态内部类
 */
class  Object3{
    private static class SingletonHolder{
        private static Object3 instance=new Object3();
    }
    private Object3(){}
    public static Object3 getInstance(){
        return SingletonHolder.instance;
    }
    public void hello(){
        System.out.println("hello world");
    }
}

/**
 * 枚举类
 */
enum Object4{
    INSTANCE;
    public void hello(){
        System.out.println("hello world");
    }
}