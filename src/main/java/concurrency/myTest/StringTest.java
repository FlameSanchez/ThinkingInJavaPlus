package concurrency.myTest;

public class StringTest {

    @Override
    public String toString() {
        return new String("avf") ;
    }

    public static void main(String[] args) {
        System.out.println(new StringTest());

    }
}
