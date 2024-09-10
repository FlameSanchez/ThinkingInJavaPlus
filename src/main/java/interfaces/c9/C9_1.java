package interfaces.c9;

public abstract class C9_1 {

    abstract void print();

    abstract void test12();
    void test1(){
        System.out.println("1");
    }
    int j=11;
    public C9_1() {
        System.out.println(j);
    print();
    }

    public static void main(String[] args) {
//        Abstra abstra = new Abstra();
        new Abstra().print();
        }
        }
 class Abstra extends C9_1{
     @Override
     void print() {
//         i=5;
         System.out.println(i);
     }
     int i=2;

     @Override
     void test12() {

     }
 }

