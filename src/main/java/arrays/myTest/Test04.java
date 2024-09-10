package arrays.myTest;

import java.util.ArrayList;
import java.util.List;

public class Test04 {

    public static void main(String[] args) {

        Object[]objects=new Object[5];
        objects = new Test04[11];
        objects = new Integer[11];
//        objects = new int[11];

        List<Object> list1 = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        List<List> list3 = new ArrayList<>();
        list3.add(list1);

    }
}
