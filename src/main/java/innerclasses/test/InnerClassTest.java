package innerclasses.test;
//测试外部类是否可以调用内部类的资源
//结果：外部类无法调用内部类资源,反过来可以
public class InnerClassTest {
    int y;

    void outTest() {
        System.out.println(1);


    }

    class InnerClass{
        int x;
        void inTest() {
            y=1;
            System.out.println(1);
        }
    }

    public static void main(String[] args) {

        InnerClassTest t = new InnerClassTest();
    }

}
