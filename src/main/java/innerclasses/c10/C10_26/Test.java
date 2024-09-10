package innerclasses.c10.C10_26;

public class Test {
    class X{
    private String name;

        public X(String name) {
            this.name = name;
            System.out.println("1");
        }
    }

    public static void main(String[] args) {

        Test test=new Test();
            Test1 test1=new Test1();
        Test1.Y y = test1.new Y(test,"ha");
    }
}
class Test1{

    class Y extends Test.X {

        public Y(Test test,String name) {
            test.super(name);
            System.out.println("2");

        }
    }
}