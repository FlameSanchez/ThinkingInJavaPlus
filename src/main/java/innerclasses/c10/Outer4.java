package innerclasses.c10;

public class Outer4 {

    /**
     * Java里面static一般用来修饰成员变量或函数。但有一种特殊用法是用static修饰内部类，普通类是不允许声明为静态的，只有内部类才可以。
     * 被static修饰的内部类可以直接作为一个普通类来使用，而不需实例一个外部类
     *
     * private关键字只能修饰内部类，不能修饰外部类
     * 当一个内部类使用了private修饰后，只能在该类的外部类内部使用
     * 对于顶级类(外部类)来说，只有两种修饰符：public和默认(default)
     */
    //这个地方一定要注意了：内部类中方法只能是static的，因此，内部类也要声明为静态的！
    private static class Ou{
        static  int i=1;
        static void doo(){
            System.out.println("do");
        }
    }

    public static void main(String[] args) {
//        Ou.doo();
//        System.out.println(Ou.i);
    }
}
