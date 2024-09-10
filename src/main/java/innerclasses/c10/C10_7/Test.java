package innerclasses.c10.C10_7;



public class Test {

    private String name;
    private void test(){
        System.out.println("test");
    }

    void test1(){
        Test1 test1 = new Test1();
        test1.change("wo");
        class  Na{

        }

    }
    class  Test1{
        private String names="names";
        String namees="namees";
        void change(String names){
            name=names;
            test();
        }
        class TT{
                void you(){
                    System.out.println("haha");
                }
                class TTS{


            }
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        Test1 test1 = test.new Test1();
        Test1.TT tt = test1.new TT();
        tt.you();


    }
}
