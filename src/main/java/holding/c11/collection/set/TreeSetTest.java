package holding.c11.collection.set;

import java.util.Set;
import java.util.TreeSet;
//按字典序排列
public class TreeSetTest {

    public static void main(String[] args) {


        Set<String> treeSet = new TreeSet();
        treeSet.add("d");
        treeSet.add("a");
        treeSet.add("c");
        treeSet.add("f");
        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
