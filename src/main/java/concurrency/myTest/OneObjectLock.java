package concurrency.myTest;

import java.sql.SQLOutput;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Test11 implements Runnable {
    OneObjectLock one;

    public Test11(OneObjectLock one) {
        this.one = one;
    }

    @Override
    public void run() {
        one.buff1();
    }
}

class Test12 implements Runnable {
    OneObjectLock one;

    public Test12(OneObjectLock one) {
        this.one = one;
    }

    @Override
    public void run() {
        one.buff2();
    }
}

class Test13 implements Runnable {
    OneObjectLock one;

    public Test13(OneObjectLock one) {
        this.one = one;
    }

    @Override
    public void run() {
        one.buff3();
    }
}

public class OneObjectLock {
    public synchronized void buff1() {
        try {
            while (true) {
                System.out.println(1);
                TimeUnit.MILLISECONDS.sleep(100);
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("exit via interrupt");
        }
    }

    public synchronized void buff2() {
        try {
            while (true) {
                System.out.println(2);
                TimeUnit.MILLISECONDS.sleep(100);
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("exit via interrupt");

        }
    }

    public synchronized void buff3() {
        try {
                System.out.println(3);
                TimeUnit.MILLISECONDS.sleep(100);
                notify();
        } catch (InterruptedException e) {
            System.out.println("exit via interrupt");
        }

    }

    public static void main(String[] args) throws InterruptedException {

        ExecutorService exec = Executors.newCachedThreadPool();
        OneObjectLock one = new OneObjectLock();
        exec.execute(new Test12(one));
        exec.execute(new Test11(one));
        exec.execute(new Test13(one));
        TimeUnit.SECONDS.sleep(2);
        exec.shutdownNow();
    }

}
