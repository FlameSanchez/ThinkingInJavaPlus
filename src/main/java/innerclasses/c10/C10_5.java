package innerclasses.c10;
class  Outer3{
    public static void main(String[] args) {

        C10_5 c10_5 = new C10_5();
        C10_5.Inner inner = c10_5.new Inner();
    }
}
public class C10_5 {
    class Inner{
        { System.out.println("Inner created"); }
    }
}
