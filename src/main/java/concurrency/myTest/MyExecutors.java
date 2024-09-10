package concurrency.myTest;

import concurrency.LiftOff;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutors {


    public static void main(String[] args) {


        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 4; i++) {

            es.execute(new LiftOff());
        }
        es.shutdown();
//        ExecutorService es1 = Executors.newFixedThreadPool(4);
//
//        es1.execute(new LiftOff());
    }
}
