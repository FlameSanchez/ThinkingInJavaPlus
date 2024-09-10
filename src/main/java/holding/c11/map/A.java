package holding.c11.map;

import java.util.*;

public class A {


    public static void main(String[] args) {

        List<A> list = new ArrayList<>();
        list.add(new B());
        Map<Integer, A> m= new HashMap<Integer, A>();
        Collection<A> values = m.values();
        Set<Integer> integers = m.keySet();
        m.put(1, new B());

    }

}
