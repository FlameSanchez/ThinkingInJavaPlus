package holding.c11.c11_19;

import holding.c11.collection.list.comparator.Student2;
import net.mindview.util.Countries;
import net.mindview.util.New;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {
//        Set<String> s1 = new HashSet<String>(Countries.names(25));
                Set<String> set = new HashSet<>(Arrays.asList("Rat", "Manx", "Cymric", "Mutt", "Pug", "Cymric", "Pug", "Man","Cymric","Rat"));
                Set<String> set1 = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        System.out.println(set);
                    String[] strings = set.toArray(new String[0]);
                        Arrays.sort(strings);
        Set<String> lhashSet = new LinkedHashSet<>();
        for (String string : strings) {
            lhashSet.add(string);
        }
        System.out.println(lhashSet);
    }

}
