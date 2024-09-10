package io.myTest;

public class Test2 extends Test{

    void testp() {
        System.out.println("2");
    }
    @Override
    public String toString() {
        testp();
        return "Test2{}";
    }

    public static void main(String[] args) {

        System.out.println(new Test2());



    }
}
