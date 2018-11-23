package yyd.phoebe.behavior.template;

/**
 * 模板模式
 * 规定流程，不管细节
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        game=new Football();
        game.play();

    }
}
