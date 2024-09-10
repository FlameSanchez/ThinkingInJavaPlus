package concurrency.myTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class A1 implements Runnable{
    @Override
    public void run() {
        System.out.println(1);
    }
}
class B1 implements Runnable{
    @Override
    public void run() {
        System.out.println(2);
    }
}
class C1 implements Runnable{
    @Override
    public void run() {
        System.out.println(3);
    }
}
public class ThreadTest2 {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();

        exec.execute(new A1());
        exec.execute(new B1());
        exec.execute(new C1());
        exec.shutdown();


    }

}
