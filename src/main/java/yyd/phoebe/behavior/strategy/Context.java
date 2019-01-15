package yyd.phoebe.behavior.strategy;

public class Context {
    private Strategy strategy;

    public Context(String strategy){
        switch (strategy){
            case "Add":
                this.strategy=new OperationAdd();
                break;
            case "Subtract":
                this.strategy=new OperationSubtract();
                break;
            case "Multiply":
                this.strategy=new OperationMultiply();
                break;
            default:
                throw new NullPointerException();
        }
    }
    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
