package concurrency.myTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WaitTest2 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(1);
            synchronized (this) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println(11);
        }
    }

    public static void main(String[] args)  {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new WaitTest2());
        exec.shutdownNow();
    }
}
