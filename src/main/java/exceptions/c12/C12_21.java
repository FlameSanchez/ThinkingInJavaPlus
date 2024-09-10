package exceptions.c12;

class MyException13 extends Exception {

    public MyException13() throws MyException14,MyException15{
    }
}
class MyException14 extends Exception {

}
class MyException15 extends Exception {

}
    public class C12_21 extends MyException13{

        public C12_21() throws MyException14, MyException15 {
             super();
        }

        public static void main(String[] args) {

            try {
                new C12_21();
            } catch (MyException14 myException14) {
                myException14.printStackTrace();
            } catch (MyException15 myException15) {
                myException15.printStackTrace();
            }

        }
    }
