package concurrency.c21;


import net.mindview.util.Print;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task2 implements Runnable {
    C21_22 c;
    int times=0;

    public Task2(C21_22 c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            while (!c.flag&&!Thread.currentThread().isInterrupted()) {
                ++times;
                }
                System.out.println("try "+times+" times");
                times=0;
                c.flag = false;
                if (Thread.interrupted())
                    return;
        }
    }
}

public class C21_22 implements Runnable {
      volatile boolean flag = false;

//    private synchronized void test() throws InterruptedException {
//         while (true) {
//                TimeUnit.MILLISECONDS.sleep(100);
//                flag = true;
//            }
//    }

    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                flag = true;
            }
        } catch (InterruptedException e) {
            return;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ExecutorService exec = Executors.newCachedThreadPool();
        C21_22 c = new C21_22();
        exec.execute(c);
        exec.execute(new Task2(c));
        TimeUnit.SECONDS.sleep(1);
        exec.shutdownNow();
    }
}
