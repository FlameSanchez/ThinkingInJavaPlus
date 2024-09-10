package exceptions.c12;

public class C12_4 extends Exception {

    static String s;

    public C12_4(String message) {
        super(message);
        s=message;
    }

    static  void test() throws C12_4 {
        System.out.println(s);
        throw new C12_4("demo");

    }

    public static void main(String[] args) {

        try {
            test();
        } catch (C12_4 e) {
            e.getMessage();

        }

    }
}
