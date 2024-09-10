package holding.c11.collection.list;

import java.util.*;

public class List01 {
    public static void main(String[] args) {
//        ArrayList<Object> list = new ArrayList<Object>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add(3, "4");
        //按下标截取一部分List，含头不含尾
//        list<Object> objects = list.subList(0, 2);
//        for (Object o : objects) {
//            System.out.println(o);
//        }
        //System.out.println(list.containsAll(objects));

        Integer[] ia={0,1,2,3,4,5,6,7,8,9};
        List<Integer> list2 =new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(4);
        List<Integer> list1 = new ArrayList<>(Arrays.asList(ia));
        Collections.shuffle(list1);
        System.out.println(list1);
        System.out.println(list1.containsAll(list2));
        Iterator<Integer> iterator = list1.iterator();

    }

}
