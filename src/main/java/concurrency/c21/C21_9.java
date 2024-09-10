package concurrency.c21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

class DaemonThreadFactory1 implements ThreadFactory {
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setPriority(Thread.MIN_PRIORITY);
        return t;
    }
}

class DaemonThreadFactory2 implements ThreadFactory {
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setPriority(Thread.MAX_PRIORITY);
        return t;
    }
}

public class C21_9 implements Runnable {
    private int countDown = 5;
    private volatile double d; // No optimization

    public String toString() {
        return Thread.currentThread() + ": " + countDown;
    }

    public void run() {
        while (true) {
            // An expensive, interruptable operation:
            for (int i = 1; i < 100000; i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0)
                    Thread.yield();
            }
            System.out.println(this);
            if (--countDown == 0) return;
        }
    }

    public static void main(String[] args) {
        ExecutorService exec1= Executors.newCachedThreadPool(new DaemonThreadFactory1());
        ExecutorService exec2 = Executors.newCachedThreadPool(new DaemonThreadFactory2());
        for (int i = 0; i < 5; i++)
            exec1.execute(new C21_9());
        exec2.execute(new C21_9());
        exec2.shutdown();
        exec1.shutdown();
    }

}
