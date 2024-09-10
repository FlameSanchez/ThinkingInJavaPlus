package holding.c11.c11_5;

import java.util.*;

public class ListFeatures01 implements Comparator<Integer> {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] ia2={2,4,5,7,9};
        Integer[] ia3={2,4};
        List<Integer> list = new ArrayList(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        System.out.println("1:    "+list);
        list.add(2);
        System.out.println("2:    "+list);
        System.out.println("3:    "+list.contains(2));
        list.remove(5);
        System.out.println("4:    "+list);
        Integer i = list.get(2);
        System.out.println("5:    "+i+"   "+list.indexOf(i));
        list.add(3, 11);
        System.out.println("6:    "+list);
        Collections.sort(list);
        System.out.println("7:    CollectionsTest Sort     "+list);
        Collections.shuffle(list);
        System.out.println("8:    CollectionsTest Shuffle     "+list);
        List<Integer> list1 = list.subList(2, 5);
        Collections.shuffle(list1);
        System.out.println("9:     sublist list1      "+list1);
        System.out.println("10:    sublist list       "+list);
        System.out.println("11:    "+list.containsAll(list1));
        List<Integer> list2 = new ArrayList(Arrays.asList(ia2));
        System.out.println("12:    list2    " + list2);
        list.retainAll(list2);
        System.out.println("13:    list    " + list);
        list.addAll(3, Arrays.asList(ia3));
        System.out.println("14:    addAll    " + list);
        list.removeAll(Arrays.asList(ia3));
        System.out.println("15:    removeAll    " + list);
        list.clear();
        System.out.println("16:    clear     " + list);
        System.out.println("17:    isEmpty    "+list.isEmpty());
        Object[] objects = list2.toArray();
        System.out.println("18:     "+objects[2]);
        Integer[] integers = list2.toArray(new Integer[5]);
        System.out.println("19:     "+integers[3]);

    }
    //如何倒序?
    @Override
    public int compare(Integer o1, Integer o2) {
        return -1;
    }
}
