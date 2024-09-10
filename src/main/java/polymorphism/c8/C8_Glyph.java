package polymorphism.c8;
class G extends C8_Glyph{
    @Override
    void test() {
        System.out.println("test02");
    }
}

public class C8_Glyph {
    void test(){
        System.out.println("test");
    }

    public C8_Glyph() {
        test();
    }

    public static void main(String[] args) {
        new G();
    }
}
