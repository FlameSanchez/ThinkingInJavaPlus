package holding.c11.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//按插入顺序排列
public class LinkedHahsSetTest {


    public static void main(String[] args) {
        Set<String> hashSet = new LinkedHashSet<>();
        hashSet.add("d");
        hashSet.add("a");
        hashSet.add("c");
        hashSet.add("f");
        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}
