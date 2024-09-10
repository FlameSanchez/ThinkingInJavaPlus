package innerclasses.c10.C10_23;


import static net.mindview.util.Print.print;

public class T   {
    private int i = 0;
    public void increment() {
        i++;
        print(i);
    }

    public static void main(String[] args) {
        T t = new T();
        t.increment();
        t.increment();
    }
}