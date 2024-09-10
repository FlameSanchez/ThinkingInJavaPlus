package generics.myTest;

import java.util.Iterator;

public class Test01 implements Iterator {
    String s;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
    void test1() {
        System.out.println(Test01.this.hasNext());
    }
    static class A{
        int i;

        void test() {

        }
    }



    public static void main(String[] args) {
//        new Test01().i
        A a = new A();


    }
}
