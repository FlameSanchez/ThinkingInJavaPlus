package concurrency.myTest;


import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

class SleepBlock implements Runnable {
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(100);
        } catch(InterruptedException e) {
            print("InterruptedException");
        }
        print("Exiting SleepBlocked.run()");
    }
}
class IOBlocked implements Runnable {
    private InputStream in;
    public IOBlocked(InputStream is) { in = is; }
    public void run() {
        try {
            print("Waiting for read():");
            in.read();
        } catch(IOException e) {
            if(Thread.currentThread().isInterrupted()) {
                print("Interrupted from blocked I/O");
            } else {
                throw new RuntimeException(e);
            }
        }
        print("Exiting IOBlocked.run()");
    }
}
public class InterruptTest1 {


    public static void main(String[] args) throws Exception {

         Thread t = new Thread(new IOBlocked(System.in));
        t.start();
        TimeUnit.MILLISECONDS.sleep(2100);
        t.interrupt();
    }
}
