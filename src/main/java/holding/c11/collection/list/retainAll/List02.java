package holding.c11.collection.list.retainAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//java 取交集方法retainAll
//
//        可以使用retainAll方法：oldCourses.retainAll(newCoures)。
//
//        如果存在相同元素，oldCourses中仅保留相同的元素。
//
//        如果不存在相同元素，oldCourse会变为空。

public class List02 {
    public static void main(String[] args) {
        Integer[] ia={0,1,2,3,4,5,6,7,8,9};
        List<Integer> list2 =new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(11);
        List<Integer> list1 = new ArrayList<>(Arrays.asList(ia));
        list1.retainAll(list2);
        System.out.println(list1);
    }
}
