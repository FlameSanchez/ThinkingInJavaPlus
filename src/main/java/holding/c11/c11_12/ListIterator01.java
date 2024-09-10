package holding.c11.c11_12;

import java.sql.Array;
import java.util.*;

public class ListIterator01 {

    static void reverse(List<Integer> list) {
        ListIterator<Integer> fwd = list.listIterator();
        ListIterator<Integer> rev =
                list.listIterator(list.size());
        int mid = list.size() >> 1;
        for(int i = 0; i < mid; i++) {
            Integer tmp = fwd.next();
            fwd.set(rev.previous());
            rev.set(tmp);
        }
    }
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,9,7));
        List<Integer> list2= new ArrayList<Integer>(Arrays.asList(4,1,9,7,4,12,6,1));
//        ListIterator<Integer> listI = list1.listIterator(7);
//        while (listI.hasPrevious()){
//            list2.add(listI.previous());
//        }
//        System.out.println(list2);

        reverse(list2);
        System.out.println(list2);
    }
}
