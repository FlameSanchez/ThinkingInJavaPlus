package generics.myTest;


//import com.sun.org.apache.regexp.internal.RE;
import innerclasses.c10.C10_23.T;

import java.util.ArrayList;
import java.util.List;

class Test05 extends Test04 {

}
class Test06 extends Test04 {

}
class Test07 extends Test06 {
    void test1() {
        System.out.println("7");
    }
}
class Test08 extends Test06 {

}
public class Test04{
//    T[]  array;

    <T extends Test06> T  test(T t) {
//        array = (T[]) new Object[11];
        return  t;
    }


    public static void main(String[] args) {
        List<? super Test06> list = new ArrayList<>();
        List<Test06> list2 = new ArrayList<>();
        list.add(new Test08());
        list.add(new Test06());
//        list.add(new Test04());
//        list.add(new Test05());
        list2.add(new Test07());


    }
}
