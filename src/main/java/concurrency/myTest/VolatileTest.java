package concurrency.myTest;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static net.mindview.util.Print.*;

public class VolatileTest implements Runnable {

    private  int x = 3;

    synchronized int plusx() {
         x = x + 2;
        return x;
    }

    @Override
    public void run() {
    plusx();
    }


    public static void main(String[] args) {
        VolatileTest v = new VolatileTest();
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 3; i++) {
            es.execute(v);
        }
        for (int i = 0; i < 5; i++) {
            print(v.x);
        }
        es.shutdown();
    }
}
