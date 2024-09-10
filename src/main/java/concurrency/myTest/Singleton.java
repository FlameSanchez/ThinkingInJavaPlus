package concurrency.myTest;
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println(instance);
            instance = new Singleton();
        }
        return instance;
    }
        }
class Testt extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"hello");
        Singleton s = Singleton.getInstance();
        System.out.println(s);
    }
    public static void main(String[] args) {
        Testt testt = new Testt();
        Testt testt1 = new Testt();

        testt.start();
        testt1.start();

    }


}
