package a_myfirstjavapackage.firstpackage.basics;

public class FirstClassTest{

    /**
     *@param:
     *@param:
     *@description:
     *@return:
     *@Author: FlameSanchez
     *@Date: 2024/3/10-1:08
     */
    public void test() {
        //循环控制语句
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
//        while (i > 0) {
//            System.out.println(i);
//        }
    }

    //内部类 内部方法
    class InnerClass1{
        int x;
        void innerMethod(){
            x=1;
            System.out.println("innerMethod");
        }
    }


    //全局变量 局部变量
    int x=3;
    public void  localVariableTest(int i) {
        i=5;
        System.out.println(i);
    }

    public static void main(String[] args) {

    }
//泛型


}
