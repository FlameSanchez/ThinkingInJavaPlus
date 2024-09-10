package generics.myTest;

import java.util.ArrayList;
import java.util.List;

public class Test10 {
    
    
    public static void main(String[] args) {
        Test10 test10 = new Test10();
        System.out.println((Test10.class instanceof Object));
//        System.out.println((Object.class instanceof Test10));
        List list = new ArrayList();
        list.add('a');
        list.add('b');
        System.out.println(list.get(1));
    }
}
