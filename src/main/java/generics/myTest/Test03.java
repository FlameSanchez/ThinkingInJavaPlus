package generics.myTest;

import java.util.Arrays;

public class Test03 {
protected  int x=1;

static String[]x1={};
static Object o;
static Class c;
    public static void main(String[] args) {
        Test03 test03 = new Test03();
        System.out.println(Arrays.toString(x1));
        System.out.println(o);
        System.out.println(c);
        System.out.println(x1.toString());
    }
}
