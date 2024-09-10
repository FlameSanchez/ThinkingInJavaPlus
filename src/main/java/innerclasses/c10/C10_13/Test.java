package innerclasses.c10.C10_13;

interface Te {
    void you();
}
public class Test {

    Te test(){
        return new Te() {
            @Override
            public void you() {
                System.out.println("1");
            }
        };
    }

    public static void main(String[] args) {
        Te test1 = new Test().test();;
        test1.you();

    }
}
