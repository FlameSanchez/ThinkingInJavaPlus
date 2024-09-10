package concurrency.myTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class InterruptTest2 implements Runnable{



    @Override
    public void run() {
        while (true) {
            try {
                synchronized (this) {
                    wait();
                }
            } catch (InterruptedException e) {
                return;
            }
            System.out.println("i am out!");
        }
    }
//current thread was suspend by wait(),
// test after 1 second shutdownNow() was called whether "i am out!" was printed
//answer is no!!!
        public static void main(String[] args) throws InterruptedException {

            ExecutorService exec = Executors.newCachedThreadPool();

            exec.execute(new InterruptTest2());
            TimeUnit.SECONDS.sleep(1);
            exec.shutdown();
        }
    }
