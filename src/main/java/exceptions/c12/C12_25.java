package exceptions.c12;

class MyException16 extends Exception {

}
class MyException17 extends MyException16{

}
class MyException18 extends MyException17 {

}
public class C12_25 {

    void test() throws MyException16{
        System.out.println("1");
        throw new MyException16();
    }

    public static void main(String[] args) {
        C12_25 c= new C12_252();

        try {
            c.test();
        } catch (MyException16 e) {
            System.out.println(e.getCause());

        }

    }
}

class C12_251 extends C12_25 {
    @Override
    void test() throws MyException16{
        System.out.println("2");
        throw new MyException17();

    }
}
class C12_252 extends C12_251 {
    @Override
    void test() throws MyException16 {
        System.out.println("3");
        throw new MyException18();

    }
}