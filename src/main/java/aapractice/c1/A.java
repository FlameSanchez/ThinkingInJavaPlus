package aapractice.c1;

public class A {
    private static long counter = 0;
    private final long id = counter++;
    public long id() { return id; }


   /* public static long getCounter() {
        return counter;
    }

    public static void setCounter(long counter) {
        A.counter = counter;
    }

    public long getId() {
        return id;
    }*/
}
