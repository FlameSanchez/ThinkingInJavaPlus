package holding.c11.collection.list.comparator;

import java.util.*;

public class List1 implements Comparator<Integer> {

    static List<Integer> list;

    public static void main(String[] args) {
        list = new ArrayList<>(Arrays.asList(1,3,4,1,7));

        Collections.sort(list, new List1());

        System.out.println(list);


    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1>o2 ? -1:((o1==o2)? 0:1);
    }
}
