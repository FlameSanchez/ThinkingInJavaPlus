package concurrency.myTest;

import concurrency.LiftOff;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;


class Test implements Runnable{

    static int x=9;
    int y=x--;
    @Override
    public void run() {
        if (y> 0) {
            System.out.println(y);
        } else {
            System.out.println("none");
        }
    }
}
class Test1 implements Callable {
    static int x=9;
    int y=x--;
    @Override
    public Object call() throws Exception {
//        if (y> 0) {
//            System.out.println("sout"+y);
//        } else {
//            System.out.println("none");
//        }
        return y;
    }
}
public class MyExecutors2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        ExecutorService es = Executors.newCachedThreadPool();
//        for (int i = 0; i < 4; i++) {
//            es.execute(new Test());
//        }
//        es.shutdown();


        ExecutorService es = Executors.newCachedThreadPool();
        List<Future<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(es.submit(new Test1()));
        }
        es.shutdown();
        for (Future<Integer> future : list) {
            System.out.println(future.get());
        }
}
}
