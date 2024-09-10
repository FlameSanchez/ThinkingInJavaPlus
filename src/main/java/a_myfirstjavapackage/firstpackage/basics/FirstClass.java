package a_myfirstjavapackage.firstpackage.basics;

import net.mindview.util.Print;

import java.util.Objects;

/* Java标识符(identifier)由数字，字母和下划线（_），美元符号（$）或人民币符号（￥）组成。在Java中是区分大小写的，而且还要求首位不能是数字。
最重要的是，Java关键字不能当作Java标识符。
下面的标识符是合法的：
myName，My_name，Points，$points,_sys_ta，OK，_23b，_3_
下面的标识符是非法的：
        #name，25name，class，&time，if */
public class FirstClass {

//    数据类型/datatypes
    byte  a;
    short b;
    int   c;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FirstClass that = (FirstClass) o;
        return a == that.a && b == that.b && c == that.c && Float.compare(e, that.e) == 0 && Double.compare(f, that.f) == 0 && g == that.g && h == that.h && x == that.x && y == that.y && z == that.z && j == that.j && Objects.equals(d, that.d);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, d, e, f, g, h, x, y, z, j);
    }

    Long  d;
    float e;
    double f;
    char g;
    boolean h;

    //    修饰符
//   public 该项目都可以访问 1
    public final int x=1;
//    默认修饰符只能在当前类的包访问 2
    int y=2;
//    protected在2的基础上子孙类可以访问
    protected int z=3;
    private int j=4;
    public static int k=5;

//构造方法的作用是给成员变量赋值
    public FirstClass() {
    }

    //    如果定义了构造方法，系统将不再提供默认的构造方法
    public FirstClass(byte a, short b, int c, Long d, float e, double f, char g, boolean h) {
        //就近原则
        // this.a代表成员变量/全局变量
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }

   static void test() {

    }

    protected static void test1() {
        System.out.println("protected methods");
    }

    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
//        Print.print(firstClass.y);

//    运算符
//   + - * / % > < = == != (a++) (++a) (a>b?1:2)三元运算符
//    转义符 \t \n
        Print.print("5/3="+5/3+"\t5%3="+5%3);
        System.out.println("Hello\rWorld");
        Print.print((3>1?1:2));
//   占位符
        float f= (float) 5 /3;
       int g=5%3;
//        System.out.printf("5/3= %f \t", f);
//        System.out.printf("5/3=%f %n5%3=%d",5/3,5%3);
    }
}
