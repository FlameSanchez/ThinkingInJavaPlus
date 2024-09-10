package holding.c11.c11_14;

import java.util.LinkedList;
import java.util.ListIterator;

public class A {

    public static void main(String[] args) {


//            LinkedList<Integer> list = new LinkedList<Integer>();
//            ListIterator<Integer> it = list.listIterator();
//            for(int i = 1; i <= 10; i++) {
//                it.add(i);
//                if(i % 2 == 0)
//                    it.previous();
//            }
//            System.out.println(list);

        LinkedList<Integer> list = new LinkedList<Integer>();
        ListIterator<Integer> it = list.listIterator();

            it.add(1);
            it.add(2);
            System.out.println(it.previous());
            it.add(3);
        System.out.println(list);


}
}
