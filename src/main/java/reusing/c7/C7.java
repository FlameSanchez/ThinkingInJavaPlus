package reusing.c7;

import access.cookie2.Cookie;

import java.util.Random;

class B extends Cookie {
     void test(){
         bite();
     }
    public static void main(String[] args) {

        new B().bite();
    }
}
public  class C7 {
     static Random random=new Random(47);
     private static final int word=random.nextInt(20);
     private static final int word6=random.nextInt(20);

     private  final int word2=random.nextInt(20);
     private  final int word3=random.nextInt(20);
     private  final int word4=random.nextInt(20);
     private  final int word5=random.nextInt(20);

    @Override
    public String toString() {
        return "TwoDimensionalArray{" +
                "word2=" + word2 +
                ", word3=" + word3 +
                ", word4=" + word4 +
                '}';
    }

    public static void main(String[] args) {

        System.out.println(word+"\t"+new C7().word2+"\t"+new C7().word3+"\t"+new C7().word4+"\t"+new C7().word5+"\t"+word6);
        C7 a = new C7();
        System.out.println(word+"\t"+a.word2+"\t"+a.word3+"\t"+a.word4+"\t"+a.word5+"\t"+word6);
        System.out.println(a
        );
    }
}
