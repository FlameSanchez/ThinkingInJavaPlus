package holding.c11.c11_18;

import net.mindview.util.Countries;

import java.util.*;

public class Main {
    public static void main(String[] args){

            Map<String,String> m1 =
                    new HashMap<String,String>(Countries.capitals(25));
            System.out.println(m1);
            String[] keys = m1.keySet().toArray(new String[0]);
            Arrays.sort(keys);
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        for (String key : keys) {
            lhm.put(key, m1.get(key));
        }
        System.out.println(lhm);

    }
}
