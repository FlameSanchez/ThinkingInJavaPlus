package containers.myTest;

public class MyTest {

    int s;
    private static final int SIZE = 10000;
    private long[] la = new long[SIZE];

    public MyTest(int s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "MyTest{" +
                "s=" + s +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new MyTest(1));


    }
}
