package polymorphism.c8;

public class C8_10 {
    void run(){
        eat();
        System.out.println("run");
    }
    void eat(){
        System.out.println("eat");
    }

    public static void main(String[] args) {
        C8_10 test1 = new Test2();
        test1.run();


    }
}
class Test1 extends C8_10{

    void eat(){
        System.out.println("eat02");
    }

}
class Test2 extends Test1{

    void eat(){
        System.out.println("eat03");
    }

}