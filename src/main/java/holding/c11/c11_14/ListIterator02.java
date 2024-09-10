package holding.c11.c11_14;


import java.util.ArrayList;
import java.util.List;

public class ListIterator02 {

    static void add(List<Integer> list){
        for (int i = 1; i <11 ; i++) {
            int mid = list.size() >> 1;
            if (list.size()%2==1) {
                mid++;
            }
            list.add(mid,i);
        }
    }

    public static void main(String[] args) {
        System.out.println(1>>1);
        ArrayList<Integer> list= new ArrayList<>();
        add(list);
        System.out.println(list);
    }
}
