package holding.c11.c11_14;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class B {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,2,3,4,1,9,7));
        ListIterator<Integer> it = list.listIterator(4);
        while (it.hasPrevious()){
        System.out.println(it.previous());
    }}
}
