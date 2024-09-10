package containers.myTest;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;
//new 一个类肯定会分配内存，进而初始化field啊
//加载内部类 会先加载外部类的static field
public class StaticInnerClass {

    static String s1=test1();

    static String test1() {
        System.out.println("2");
        return "haha";
    }

    static class InnerClass {
        String s=test();

              String test() {
            System.out.println("1");
            return "haha";
        }

         class InnerClass2 {
            String s2=test2();

                     String test2() {
                System.out.println("3");
                return "haha";
            }
        }

    }

    static void tt() {
        System.out.println(new InnerClass());
    }
    public static void main(String[] args) {

tt();
        //        System.out.println(new StaticInnerClass());
    }

}
