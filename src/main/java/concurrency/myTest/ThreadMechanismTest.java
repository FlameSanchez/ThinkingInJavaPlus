package concurrency.myTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadMechanismTest implements Runnable
{
        int i;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();
        ThreadMechanismTest test = new ThreadMechanismTest();
        for (int i = 0; i < 2; i++) {
            es.execute(test);
        }
        TimeUnit.MILLISECONDS.sleep(500);
        es.shutdownNow();
        System.out.println(test.i);
    }


    @Override
    public void run() {
//        System.out.println(1);



        while (true)
            System.out.println(1);
    }
}
