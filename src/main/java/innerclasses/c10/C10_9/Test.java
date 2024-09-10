package innerclasses.c10.C10_9;

public class Test {

    public Te test(Boolean tru) {
        if (tru) {
            class TestIn implements Te {
                public TestIn() {
                    you();
                }

                @Override
                public void you() {
                    System.out.println("1");
                }
            }
            return new TestIn();
        }
        return null;
    }

    interface Te {
        void you();
    }

    public static void main(String[] args) {
        Test test1 = new Test();
        test1.test(true);
    }

}
