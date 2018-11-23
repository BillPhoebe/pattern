package yyd.phoebe.behavior.iterator;

/**
 * 迭代器模式
 * 很经典
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator<String> iterator = nameRepository.getIterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println("Name: "+name);
        }
    }
}
