package concurrency.myTest;

import java.util.SortedMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class A implements Runnable{

    @Override
    public void run() {
        System.out.println(1);
    }
}
class B implements Runnable{

    @Override
    public void run() {
        System.out.println(2);
    }
}
public class ThreadTest implements Runnable{

    int i;
    public ThreadTest(int x) {
        i=x;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {

            new Thread(new ThreadTest(i)).start();
        }
        System.out.println("start");

    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
