package concurrency.myTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTostringTest implements Runnable{

    public void run() {
            System.out.println(this);
    }
    public String toString() {
        return Thread.currentThread() + "   ";
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            exec.execute(new ThreadTostringTest());
        }
//        System.out.println(new ThreadTostringTest());
//        for (int i = 0; i < 5; i++) {
//            new Thread(new ThreadTostringTest()).start();
//        }
        exec.shutdown();
    }

}
