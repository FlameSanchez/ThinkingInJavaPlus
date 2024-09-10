package exceptions.c12;

class MyException01 extends Exception{
}
class MyException02 extends Exception{
}
class MyException03 extends Exception{
}
public class C12_9 {


    void test() throws MyException01,MyException02,MyException03 {
        throw new MyException01();
    }

    public static void main(String[] args) {
        C12_9 c12_9 = new C12_9();
        try {
            c12_9.test();
        } catch (MyException01 myException01) {
            System.out.println("caught" + myException01);
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("caught" + e );

        }
    }


}
