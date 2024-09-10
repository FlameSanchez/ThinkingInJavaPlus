package containers;

import holding.c11.c11_18.Main;

import java.util.*;

public class C17_38 {
    static List<Test<Map<Integer,Integer>>> tests =
            new ArrayList<Test<Map<Integer,Integer>>>();
    static {
        tests.add(new Test<Map<Integer,Integer>>("put") {
            int test(Map<Integer,Integer> map, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for(int i = 0; i < loops; i++) {
                    map.clear();
                    for(int j = 0; j < size; j++)
                        map.put(j, j);
                }
                return loops * size;
            }
        });
        tests.add(new Test<Map<Integer,Integer>>("get") {
            int test(Map<Integer,Integer> map, TestParam tp) {
                int loops = tp.loops;
                int span = tp.size * 2;
                for(int i = 0; i < loops; i++)
                    for(int j = 0; j < span; j++)
                        map.get(j);
                return loops * span;
            }
        });
        tests.add(new Test<Map<Integer,Integer>>("iterate") {
            int test(Map<Integer,Integer> map, TestParam tp) {
                int loops = tp.loops * 10;
                for(int i = 0; i < loops; i ++) {
                    Iterator it = map.entrySet().iterator();
                    while(it.hasNext())
                        it.next();
                }
                return loops * map.size();
            }
        });
    }

    public static void main(String[] args) {

        Tester.run(new HashMap<Integer, Integer>(10, 0.75f),tests);
        Tester.run(new HashMap<Integer, Integer>(100, 0.10f),tests);
        Tester.run(new HashMap<Integer, Integer>(100, 0.75f),tests);
        Tester.run(new HashMap<Integer, Integer>(100, 0.99f),tests);
//        Tester.run(new HashMap<Integer, Integer>(1000, 0.75f),tests);
//        Tester.run(new HashMap<Integer, Integer>(10000, 0.75f),tests);

    }
}
