package containers.myTest;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {


    public static void main(String[] args) {

        Map<Object, Object> map= new TreeMap<>();
//
//        map.put(2, 3);
//        map.put(4, 1);
//        map.put(1, 4);
//        map.put(3, 6);

        map.put("f", 3);
        map.put("d", 1);
        map.put("s", 4);
        map.put("z", 6);

        Set<Object> set = map.keySet();
        for (Object o : set) {
            System.out.println(o);
        }


    }
}
