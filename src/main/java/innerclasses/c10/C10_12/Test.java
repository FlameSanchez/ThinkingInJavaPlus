package innerclasses.c10.C10_12;

public class Test {

    private String name;

    private void test() {
        System.out.println("test");
    }

    void test1() {
        new Object() {
            private String names = "names";
            void change(String names) {
                name = names;
                test();
            }
        }.change("a");
    }

    public static void main(String[] args) {

        Test test = new Test();
        test.test1();

    }
}