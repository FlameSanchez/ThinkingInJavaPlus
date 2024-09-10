package containers.myTest;

import net.mindview.util.MapData;
import net.mindview.util.RandomGenerator;

import java.util.*;

import static net.mindview.util.Countries.names;

public class TreeSeries {

//    public static void main(String[] args) {
//
//        TreeMap<String, Boolean> tmap = new TreeMap<>();
//        tmap.put("B", true);
//        tmap.put("C", false);
//        tmap.put("G", false);
//        tmap.put("S", true);
//        System.out.println(tmap);
//        SortedMap<String, Boolean> g = tmap.headMap("G");
//        System.out.println(g);
//
//        LinkedHashMap lmap= new MapData<>(new RandomGenerator.Double(), new RandomGenerator.Integer(), 4);
//        System.out.println(lmap);
//
//        TreeMap<Double, Integer> tmap1 = new TreeMap<>(lmap);
//        System.out.println(tmap1);
//        System.out.println(tmap1.headMap(0.73));
//    //String startsWith() 判断首字符
//        String s="1a";
//        System.out.println(s.startsWith("1"));
//
//    }

    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>();
        for(int i = 0; i < 5; i++)
            set.addAll(names(10));
//        System.out.println(set);
    }
}
