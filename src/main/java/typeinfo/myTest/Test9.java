package typeinfo.myTest;

import java.util.HashMap;
import java.util.Map;

public class Test9 {
int x=12;
    static class Test10 extends HashMap {

public static void main(String[] args) {
    HashMap hashMap = new HashMap();
    hashMap.put(1, 1);
    hashMap.put(2, 2);
    hashMap.put(3, 3);
    System.out.println(hashMap.entrySet());
//    System.out.println(nMap.Entry);
    System.out.println(Test6.class.isInstance(new Test7()));
    System.out.println(Test7.class.isInstance(new Test6()));
    System.out.println(Test7.class.isInstance(new Test7()));
}
    }


}
