package containers.myTest;

import java.util.Calendar;

//普通类也能产生匿名内部类
public class InnerClassTest {

    void test() {
        System.out.println("1");
    }

    public static void main(String[] args) {
//        System.out.println(Integer.valueOf("abcd".substring(0), 10));
//        System.out.println(Integer.valueOf("10"));
//        System.out.println(Integer.decode("10"));
//        System.out.println("abc".substring(0));

        InnerClassTest a = new InnerClassTest(){
            @Override
            void test() {
                System.out.println("2");
            }
        };
        a.test();

    }
}
