package concurrency.myTest;

public class S1 {

    void test() {
        System.out.println(1);
    }

    public static void main(String[] args) {

        System.out.println(new S1() {
            int g = 112;

            @Override
            void test() {
                super.test();
            }
        }.g);
    }

}
