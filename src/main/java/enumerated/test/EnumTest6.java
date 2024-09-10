package enumerated.test;
//枚举重写方法
public class EnumTest6 {

    enum Test{
        A,
        B{
            void Test() {
                System.out.println("2");
            }
        };


        void Test() {
            System.out.println("1");
        }


    }

    public static void main(String[] args) {

        Test.A.Test();
        Test.B.Test();

    }
}
