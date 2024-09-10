package concurrency.myTest;

import concurrency.EvenChecker;
import concurrency.IntGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class S {

    private final int id;
    private static List entrances=new ArrayList();

    public S(int id) {
        this.id = id;
        // Keep this task in a list. Also prevents
        // garbage collection of dead tasks:
        entrances.add(this);
    }

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            new S(i);
        }
        for (Object entrance : entrances) {

        }
    }

}
