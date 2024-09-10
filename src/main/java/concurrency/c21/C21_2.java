package concurrency.c21;

public class C21_2 implements Runnable{
    int n;

    public C21_2() {
    }

    public C21_2(int num) {
        n=num;
    }

     int f(int n) {
        if (n<2) return 1;
        return f(n - 1) + f(n - 2);}

     String s(int n) {
        if (n==0)return "1";
        return s(n - 1) +","+f(n); }

    @Override
    public void run() {
        System.out.println(s(n));
        Thread.yield();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new C21_2(i)).start();
        }


    }
}
