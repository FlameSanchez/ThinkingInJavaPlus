package containers.myTest;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class ComparableTest implements Comparable<ComparableTest>{

int x;

    public ComparableTest(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "ComparableTest{" +
                "x=" + x +
                '}';
    }

    public static void main(String[] args) {


        List<ComparableTest> list = new ArrayList<>();
        List<ComparableTest> list1 = new LinkedList<>();
        TreeSet<ComparableTest> treeSet= new TreeSet<>();
        ArrayBlockingQueue<ComparableTest> queue= new ArrayBlockingQueue<ComparableTest>(5);
//        queue.add(new ComparableTest(3));
//        queue.add(new ComparableTest(11));
//        queue.add(new ComparableTest(312));
//        queue.add(new ComparableTest(1));
//        queue.add(new ComparableTest(23));
//        System.out.println(queue);

         list1.add(new ComparableTest(3));
        list1.add(new ComparableTest(11));
        list1.add(new ComparableTest(312));
        list1.add(new ComparableTest(1));
        list1.add(new ComparableTest(23));
        ComparableTest item;
        while((item = ((LinkedList<ComparableTest>) list1).poll()) != null)
            System.out.println(item);
//        Collections.sort(list1);
//        System.out.println(list1);


//        for (int i = 0; i < 10; i++) {
//
//            list.add(new ComparableTest(i));
//            treeSet.add(new ComparableTest(i));
//            queue.add(new ComparableTest(i));
//        }
//        Collections.sort(list);
//        System.out.println(list);
//        System.out.println(treeSet);

    }

    @Override
    public int compareTo(ComparableTest c) {
        return x>c.x? 1:-1;
    }
}
