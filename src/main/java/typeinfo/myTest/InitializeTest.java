package typeinfo.myTest;

class InitializeTest2 {
    static {
        System.out.println("incoming");
    }

    static  final int x = 1;
    static  int y = InitializeTest.z;

//    static void test() {
//        System.out.println("method");
//    }
//
//    static class Test {
//        static {System.out.println("static inner class");}
//    }
}

public class InitializeTest {
    static {System.out.println("incoming2");
    }

    public static int z=2;

    public static void main(String[] args) {

        System.out.println(InitializeTest2.x);
        System.out.println(InitializeTest2.y);
    }
}
