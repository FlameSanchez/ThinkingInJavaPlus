package innerclasses.c10.C10_11;


class Clas1{
    Inter01 myMethod(){

        return new Inter01() {
            private int i=1;

            void test1() {

            }
            @Override
            public void test() {

            }
        };
    }

    private class Cla implements  Inter01{

        @Override
        public void test() {
            System.out.println("11");
        }
    }}
public class Clas {
    public static void main(String[] args) {
        Inter01 inter01 = new Clas1().myMethod();
//        Cla cla = new Clas1().myMethod();


    }
}
