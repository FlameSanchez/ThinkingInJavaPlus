package concurrency.myTest;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class P1 implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 3; i++)
            System.out.println(1+""+Thread.currentThread());
            Thread.yield();


    }
}
class P2 implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
        for (int i = 0; i < 3; i++)
            System.out.println(2+""+Thread.currentThread());
            Thread.yield();

    }
}
class P3 implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        for (int i = 0; i < 3; i++)
            System.out.println(3+""+Thread.currentThread());
            Thread.yield();
    }
}
public class PriorityTest {
    public static void main(String[] args) {
//        ExecutorService es = Executors.newCachedThreadPool();
//        es.execute(new P1());
//        es.execute(new P2());
//        es.execute(new P3());
//        es.shutdown();
        new Thread(new P1()).start();
        new Thread(new P2()).start();
        new Thread(new P3()).start();
    }


}
