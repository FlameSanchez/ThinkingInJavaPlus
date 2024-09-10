package concurrency.myTest;


import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

class SleepBlocked implements Runnable {
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(100);
        } catch(InterruptedException e) {
            print("InterruptedException");
        }
        print("Exiting SleepBlocked.run()");
    }
}

public class InterruptTest {

    public static void main(String[] args) throws InterruptedException {
        SleepBlocked sb = new SleepBlocked();
        ExecutorService exec =
                Executors.newCachedThreadPool();
//        Future<?> f = exec.submit(sb);
//        TimeUnit.MILLISECONDS.sleep(100);
//        print("Interrupting " + sb.getClass().getName());
//        f.cancel(true); // Interrupts if running
//        print("Interrupt sent to " + sb.getClass().getName());

        exec.execute(sb);
        TimeUnit.MILLISECONDS.sleep(100);
        exec.shutdownNow();


    }
}
