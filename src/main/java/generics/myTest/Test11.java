package generics.myTest;

import java.util.List;
// making the class generic wouldn’t work in thiscase because the method is static
//static修饰的方法 里面都必须是static
class MethodParameter {
    public static <T> T[] f(T[] arg) { return arg; }
}
public class Test11 <T>{
    public T[] f(T[] arg) { return arg; }
    int x;
    List list;
    static void test(int z) {
//        x=z;
        //    return null;

    }
    public static void main(String[] args) {

    }
}
