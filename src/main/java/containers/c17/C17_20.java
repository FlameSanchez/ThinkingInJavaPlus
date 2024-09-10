package containers.c17;

import containers.MapEntry;
import containers.SimpleHashMap;
import net.mindview.util.Countries;

import java.util.*;
public class C17_20 {

    //map 结果无序是因为set无序
    public static void main(String[] args) {
        SimpleHashMap<String,String> m =
                new SimpleHashMap<String,String>();
        System.out.println(m.put("a", "b"));
        System.out.println(m.put("a", "c"));

        System.out.println(m.put("b", "c"));
        System.out.println(m.put("d", "c"));

        System.out.println(m);

        System.out.println("a".hashCode());
        System.out.println("b".hashCode());
        System.out.println("c".hashCode());
        System.out.println("d".hashCode());
        System.out.println(new SimpleHashMap<>().hashCode());
    }}


