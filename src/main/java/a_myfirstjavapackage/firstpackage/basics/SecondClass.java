package a_myfirstjavapackage.firstpackage.basics;

//封装继承多态
public class SecondClass extends FirstClass{


    //多态调用成员的特点
//变量调用：编译看左边，运行也看左边。
//方法调用：编译看左边，运行看右边。
    public static void main(String[] args)   {
        FirstClass sc = new SecondClass();
    //x y z (no j)
    //        System.out.println(sc.  );

        FirstClass firstClass = new FirstClass();
        FirstClass firstClass1 = new FirstClass((byte) 1, (short) 1, 1, 1L, 1F, 1.0, '1', true);

    }
}
