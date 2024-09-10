package typeinfo.myTest;

import java.util.HashMap;
import java.util.Map;

class Test11 {

    void test() {
        System.out.println("1");
    }
}
public class Test10 extends Test11{
    void test2() {
        test();
        System.out.println("1");
    }

    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();
//map.g
//        map.g
    }
}
