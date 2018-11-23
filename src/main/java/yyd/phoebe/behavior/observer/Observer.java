package yyd.phoebe.behavior.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
