package exceptions.c12;

class MyException extends Exception{

}
public class C12_8  {


    static void test() throws MyException {
        throw new MyException();
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

}
