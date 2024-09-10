package concurrency.c21;

public class C21_15 {

    private Object object=new Object();
    private Object object1=new Object();

    void a() {
        synchronized (object) {
            for (int i = 0; i < 4; i++) {
                System.out.println("1");
                Thread.yield();
            }
        }
    }
    void b() {
        synchronized (object ) {
            for (int i = 0; i < 4; i++) {
                System.out.println("2");
                Thread.yield();
            }
        }
    }
    void c() {
        synchronized (object1) {
            for (int i = 0; i < 4; i++) {
                System.out.println("3");
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        C21_15 c = new C21_15();

        //java8
        new Thread(){
            @Override
            public void run() {
                c.a();
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                c.b();
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                c.c();
            }
        }.start();
    }
}   /* Output: (Sample)
1
1
3
1
3
1
3
2
3
2
2
2
*///:~
