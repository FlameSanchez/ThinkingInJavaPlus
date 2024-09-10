package io.myTest;

import java.io.Serializable;

public class Test3 implements Serializable {
    int x,y=3,z=1;
    @Override
    public String toString() {
        return "Test3{}"+super.toString();
    }

    public static void main(String[] args) {


        System.out.println(new Test3());
    }
}
