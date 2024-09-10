package containers.myTest;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import innerclasses.c10.C10_23.T;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionFunctionality {


    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //addA()加所有
        list.addAll(Arrays.asList(2, 4,5));
//  差交集
//        list.removeAll(Arrays.asList(2, 4,5));
//        list.retainAll(Arrays.asList(2, 4));

        System.out.println(list);
//        list.clear();
//        list.contains(1);
//        list.containsAll(Arrays.asList(2, 4));
//        list.isEmpty();
//        list.iterator();
//        list.remove(1);
//        list.removeAll(Arrays.asList(2, 4));
//        list.toArray();
//        list.size();
//        list.indexOf(1);

    }
}
