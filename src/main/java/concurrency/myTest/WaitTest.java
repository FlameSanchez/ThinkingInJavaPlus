package concurrency.myTest;

public class WaitTest {

    void test()  {

        System.out.println(1);
        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());

        }
        System.out.println(2);
        notify();
        System.out.println(3);
    }
    public static void main(String[] args)  {
        WaitTest waitTest = new WaitTest();
        waitTest.test();

    }
}
