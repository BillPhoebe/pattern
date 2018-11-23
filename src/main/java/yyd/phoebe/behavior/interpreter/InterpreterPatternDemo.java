package yyd.phoebe.behavior.interpreter;

/**
 * 解释器模式
 */
public class InterpreterPatternDemo {
    public static void main(String[] args) {
        Expression maleExpression = getMaleExpression();
        Expression marriedWomanExpression = getMarriedWomanExpression();
        System.out.println("John is male? "+maleExpression.interpret("John"));
        System.out.println("Julie is a married woman? "+marriedWomanExpression.interpret("Married Julie"));
    }
    public static Expression getMaleExpression(){
        TerminalExpression robert = new TerminalExpression("Robert");
        TerminalExpression john = new TerminalExpression("John");
        return new OrExpression(robert,john);
    }
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
