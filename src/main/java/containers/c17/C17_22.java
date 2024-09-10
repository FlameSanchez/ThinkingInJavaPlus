package containers.c17;

import containers.SimpleHashMap;
import net.mindview.util.Countries;

public class C17_22 {


    public static void main(String[] args) {

        SimpleHashMap<String,String> map= new SimpleHashMap<>();
        map.put("a", "42");
        map.put("b", "112");
        map.put("c", "2");
        map.put("g", "1");
        map.put("s", "b");
        map.put("z", "11");
        map.put("f", "6");
        System.out.println(map);
        System.out.println(map.remove("a"));
        System.out.println(map.remove("h"));
        System.out.println(map);
        map.clear();
        System.out.println(map);
    }
}
