package arrays.c16;

import java.util.ArrayList;
import java.util.List;

public class C16_10 {


    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
//        list.add(new ArrayList<Integer>());
        ArrayList<ArrayList<Object>> list1 = new ArrayList<>();
        list1.add(new ArrayList<Object>());
        list1.get(0).add("ads");
        System.out.println(list1);
//list1.get(0).
    }
}
