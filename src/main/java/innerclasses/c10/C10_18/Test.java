package innerclasses.c10.C10_18;

public class Test {
    static int j = 2;
    int i = 1;

    void test() {
        System.out.println("1");

    }

    static class Tt {

        class Xx {
        }

        void rech() {

        }
    }

    class Tt1 {

        int j = 2;

        void rech() {

        }
    }


    public static void main(String[] args) {
        Tt tt = new Tt();
//        tt.
        Tt1 tt1 = new Test().new Tt1();
//        tt1.t
    }


}

class Other {
    // Specifying the nested type outside
// the scope of the class:
    void f() {
        Test.Tt tt = new Test.Tt();
//        aapractice.equals.Test09.Tt1 tt1 = new aapractice.equals.Test09.Tt1();
//        E18_NestedClass.Nested ne =
//                new E18_NestedClass.Nested();
    }
}