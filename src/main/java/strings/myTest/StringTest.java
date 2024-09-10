package strings.myTest;

public class StringTest {
    String s = "s";
    void test() {
        String s = this.s.toUpperCase();
    }

    String test1() {
        String s1 = s+"a";
        return s1;
    }
    String test2() {
        String s1 = s+"a";
        return s1;
    }
    public static void main(String[] args) {
        StringTest test = new StringTest();

        test.test();
        System.out.println(test.s);
        test.test1();
        System.out.println(test.s);

        test.test2();
        System.out.println(test.s);

    }
}
