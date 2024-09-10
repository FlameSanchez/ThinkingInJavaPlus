package containers.myTest;

import containers.MapEntry;

import java.util.HashMap;
import java.util.LinkedList;

public class HashmapTest {



    public static void main(String[] args) {
        HashMap<Object, Integer> hashMap= new HashMap<>();
        HashmapTest[] hTests = new HashmapTest[5];
        for (int i = 0; i < hTests.length; i++) {
            hTests[i]=new HashmapTest();
            hashMap.put(hTests[i],i);
        }
        HashmapTest hashmapTest = new HashmapTest();
        hashMap.put(hashmapTest,5);
        System.out.println(hashMap.containsKey(hashmapTest));
        for (HashmapTest hTest : hTests) {
            System.out.println(hashMap.get(hTest));
        }

    }
}
