package concurrency.myTest;

class X {

}
class Task  {
    static X blocker = new X();

    public Task() {
        System.out.println(blocker);
    }
}

class Task2{
    // TwoDimensionalArray separate Blocker object:
    static X blocker = new X();

    public Task2() {
        System.out.println(blocker);

    }
}
public class StaticTest {
    public static void main(String[] args) {

new Task();
new Task2();
    }
}
