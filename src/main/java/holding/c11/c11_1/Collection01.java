package holding.c11.c11_1;

import java.util.*;

public class Collection01 {


    public static void main(String[] args) {
        Set<Object> set = new HashSet<Object>();
        Collection<Object> list2 = new ArrayList<Object>();
        Map hashMap = new HashMap();

        List<Integer> integers = Arrays.asList(3,4,1,2,4);
        List<Integer> integers1 = new ArrayList<Integer>();
        integers1.add(3);
        for (Integer integer : integers1) {
            System.out.println(integer);
        }

    }
}
