package concurrency.c21;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task22 implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (this) {
                    wait();
                }
            } catch (InterruptedException e) {
                return;
            }
            System.out.println("i am out!");
        }
    }
}

public class C21_22_2 implements Runnable {
    Task22 task;

    public C21_22_2(Task22 task) {
        this.task = task;
    }

    @Override
    public void run() {
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                synchronized (task) {
                    task.notify();
                    //? 加上下面的注释，为什么会输出“i am out!”？

//                    while (1>0) {
//                        if (Thread.interrupted()) {
//                            return;
//                        }
//                    }
                }
            } catch (InterruptedException e) {
               return;
            }
        }
    }
        public static void main (String[]args) throws InterruptedException {
            ExecutorService exec = Executors.newCachedThreadPool();
            Task22 t = new Task22();
            C21_22_2 c = new C21_22_2(t);
            exec.execute(c);
            exec.execute(t);
            TimeUnit.SECONDS.sleep(1);
            exec.shutdownNow();
        }
    }

