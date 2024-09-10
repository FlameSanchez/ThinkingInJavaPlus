package concurrency.c21;

public class C21_1 implements Runnable{

    static long counter = 0;
    final long id= counter++;
int countdown=10;
    public C21_1() {
        System.out.println("start");
    }

    void count() {
        while (--countdown > 0) {
            System.out.println();
        }

    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("hey"+id);
            Thread.yield();
    }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
           new Thread(new C21_1()).start();
        }

        System.out.println("end");

    }
}
