package typeinfo.myTest;

import java.util.ArrayList;
import java.util.List;

class Test7 extends Test6{

}

class Test8 {

}
public class Test6 extends Test8{

    static List<? extends Test6> test() {
        List<Test6> list = new ArrayList<>();
        return list;
    }

    public static void main(String[] args) {

        test();
    }
}
