package holding.c11.c11_29;

import java.util.Comparator;
import java.util.PriorityQueue;
class  Fruit implements Comparable {
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
class  Fruit01  {

}
public class Test {

    public static void main(String[] args) {

        Test test1 = new Test();
        Test test2 = new Test();
        Test test3 = new Test();

        PriorityQueue<Object> tests = new PriorityQueue<>();
        tests.add(test1);
        tests.add(new Fruit());
        tests.add(new Fruit01());


    }
}
