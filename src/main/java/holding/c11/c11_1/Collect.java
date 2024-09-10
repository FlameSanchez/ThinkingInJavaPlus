package holding.c11.c11_1;

import java.util.*;

public class Collect {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        List<Integer> integers = Arrays.asList(3,4,1,2,4);
        Collection<Object> list1 = new ArrayList<Object>(integers);

        Set<Object> set = new HashSet<Object>();

        Map hashMap = new HashMap();
        for (Integer integer : integers) {
            System.out.println(integer);
        }
//        set.add("1");
//        set.add(1);
//        set.add(1);
//        set.add("2");
//
//        set1.add("11");
//        set1.add(12);
//        set1.add(13);
//        set1.add("21");
//        set.addAll(set1);
//
//        for (Object o : set) {
//            System.out.println(o);
//        }



    }
}/* Output:
1
1
2
11
12
13
21
*///:~
