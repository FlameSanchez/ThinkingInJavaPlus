package exceptions.myTest;

public class Test extends  Exception{

    public Test(String message) throws Test {
        super(message);

        throw new Test("msg");
    }

    public static void main(String[] args) {


        try {
            new Test("msg");
        } catch (Test test) {
            test.printStackTrace();
        }
    }
}
