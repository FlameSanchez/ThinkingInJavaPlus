package enumerated.test;

import java.util.HashSet;

public class HashsetTest {


    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.remove(2);
        for (Object o : set) {

            System.out.println(o);
        }
    }
}
