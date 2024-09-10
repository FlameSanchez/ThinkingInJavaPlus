package concurrency.c21;

import java.util.concurrent.*;

public class C21_10 implements Callable<Integer> {
    int t;

    int f(int n) {
        if (n<2) return 1;
        return f(n - 1) + f(n - 2);}

    static int sum=0;

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < t; i++) {
            sum += f(i);
        }
        return sum;
    }

    public C21_10(int t) {
        this.t = t;
    }

    public static Future runTask(int x) {

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Integer> future = es.submit(new C21_10(x));
        es.shutdownNow();
        return future;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(runTask(5).get());

    }
}
