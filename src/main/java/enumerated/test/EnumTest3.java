package enumerated.test;

public class EnumTest3 {


    enum Letters{

        A(1),B(2),C(3),D(4),E();

       private Letters(int x) {
            System.out.println(x);
        }
       Letters() {
            System.out.println("1");
        }
    }


    public static void main(String[] args) {

        Letters a =EnumTest3.Letters.A;



    }
}
