package yyd.phoebe.behavior.visitor;

public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts=new ComputerPart[]{new Monitor(),new Mouse(),new Keyboard()};
    }
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
    }
}
