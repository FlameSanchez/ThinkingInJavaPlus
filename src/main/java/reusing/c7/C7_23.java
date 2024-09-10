package reusing.c7;
class LoadTest {
    // The static clause is executed
// upon class loading:
    static {
        System.out.println("Loading LoadTest");
    }
    static void staticMember() {}
}
public class C7_23 extends LoadTest{
    static {
        System.out.println("Loading LoadTest");
    }
    static String NAME1=test();
    static    String test(){
        System.out.println("test");
        return "name";
    }
    public static void main(String args[]) {
        System.out.println("Calling static member");
        LoadTest.staticMember();
        System.out.println("Creating an object");
        new LoadTest();
    }
}

