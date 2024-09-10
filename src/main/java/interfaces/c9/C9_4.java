package interfaces.c9;

public interface C9_4 {
    public String name="2";
    void test();
}
class C9_41 implements C9_4{

    @Override
    public void test() {
        System.out.println("1");
    }

    public static void main(String[] args) {

    }
}
class  C9_42 extends C9_41 {
    public static void main(String[] args) {
        new C9_42().test();
    }
}
