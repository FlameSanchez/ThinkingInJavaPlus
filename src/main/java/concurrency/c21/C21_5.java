package concurrency.c21;

import containers.myTest.FormatTest;
import holding.ForEachCollections;
import net.mindview.atunit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
//Modify Exercise 2 so that the task is a Callable that sums the values of all the Fibonacci numbers.
// Create several tasks and display the results.
    public class C21_5  implements Callable<Integer> {
    int t;
    public C21_5(Integer i) {
        t=i;
    }
    int f(int n) {
        if (n<2) return 1;
        return f(n - 1) + f(n - 2);}
    static int sum=0;

    @Override
    public Integer call() throws Exception {
            sum += f(t);
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService es = Executors.newCachedThreadPool();
        List<Future<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(es.submit(new C21_5(i)));
        }
        es.shutdown();
        for (Future<Integer> future : list) {
            System.out.println(future.get());
        }

    }
}
