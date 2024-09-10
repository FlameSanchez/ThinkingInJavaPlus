package exceptions.myTest;

class MyException11 extends Exception {

}
class MyException12 extends Exception {

}
public class Test1 {


    static void test() throws MyException11{
        System.out.println("1");
        throw new RuntimeException();
    }

    public static void main(String[] args) {

        int i = 2;
        try {
            test();
        } catch (MyException11 e) {

            System.out.println("2");
        }
        finally {

        }
    }
}
