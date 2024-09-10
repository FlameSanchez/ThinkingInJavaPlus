package interfaces.c9;

public abstract class C9_3 {

    abstract void print();

    int j=11;
    public C9_3() {
        System.out.println(j);
        print();
    }
    public static void main(String[] args) {
//        Abstra abstra = new Abstra();
        new Abstra().print();
    }
}
class Abstra1 extends C9_3{
    @Override
    void print() {
//         i=5;
        System.out.println(i);
    }
    int i=2;


}













