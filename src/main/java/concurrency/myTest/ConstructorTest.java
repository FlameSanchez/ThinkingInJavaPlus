package concurrency.myTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ConstructorTest2 {
    public ConstructorTest2() {
        System.out.println(this);
        synchronized (this) {
            System.out.println(this);
        }
    }
}

public class ConstructorTest {
    public ConstructorTest() {
        System.out.println(this);
        synchronized (this) {
            System.out.println(this);
        }
    }

    public static void main(String[] args) {

        ConstructorTest constructorTest = new ConstructorTest();
        ConstructorTest2 constructorTest2 = new ConstructorTest2();

        final Runnable r1 = new Runnable() {
            public void run() {
                        synchronized (this) {
                            System.out.println(this);

                }
            }
        };
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(r1);
        exec.shutdown();
    }
}
