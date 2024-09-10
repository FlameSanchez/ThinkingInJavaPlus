package concurrency.myTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class One extends Thread{
    public One() {
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("1");
            Thread.yield();
        }
    }
}
class Two extends Thread{
    One one;

    public Two(One one) {
        this.one = one;
        start();
    }

    @Override
    public void run() {
        try {
            one.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("2");
        }
    }
}

public class JoinTest1 {
    public static void main(String[] args) {
        One one = new One();
        new Two(one);


    }


}
