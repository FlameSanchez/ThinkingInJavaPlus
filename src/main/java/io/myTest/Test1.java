package io.myTest;

import java.util.Arrays;
import java.util.Random;

public class Test1 extends Test{
    static int x = test1();

    private static int test1() {
        System.out.println("2");
        return 1;
    }

    static void test() {
        System.out.println("1");
    }
    public Test1() {
    }
//    protected  int x=12;

    @Override
    public String toString() {
        return "Test1{}";
    }

    public static void main(String[] args) {
        Test1.test();
//        System.out.println(0x8FFFFFF);
////        System.out.println(1.0e9);

    }
}
