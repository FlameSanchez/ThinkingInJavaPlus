package strings.myTest;

public class ImmutableStrings {

    String x = "x";

    void test() {
        x = "y";
    }
    String test1() {
        String s = x.toUpperCase();
        return s;
    }
    String test2() {
        String s = x.concat("asdf");
        return s;
    }
    public static void main(String[] args) {
        ImmutableStrings s = new ImmutableStrings();
        System.out.println(s.test1());
        System.out.println(s.x);

        System.out.println(s.test2());
        System.out.println(s.x);

        s.test();
        System.out.println(s.x);

    }
}
