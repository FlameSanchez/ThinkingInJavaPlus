package innerclasses.c10.C10_6_2;

import innerclasses.c10.C10_6_1.Inter1;
import innerclasses.c10.C10_6.Inter;

public class Inter2 extends Inter1 {


    public  Inter test1(){
       Inner inner= new Inner();
        return inner;
    }


    public static void main(String[] args) {
        Inter2 inter2 = new Inter2();
        Inter inter = inter2.test1();
        inter.test();


    }

}
