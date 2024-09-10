package a_myfirstjavapackage.firstpackage.basics;

/* 方法重写
 方法名相同,参数类型/数量/排序不同就是方法重写 也只看这两个标准*/
public class MethodFirstClass extends FirstClass {
    static int x = 100;
    int y = 400;

    //值传递(pass by value) 引用传递(pass by reference)
    public static void change(int i) {
        i = 200;
    }

    public static void change2() {
        x = 300;
    }

    public void change3() {
        y = 500;
    }

    public static void main(String[] args) {

        change(x);
        System.out.println(x);
        change2();
        System.out.println(x);

        MethodFirstClass m = new MethodFirstClass();
        m.change3();
        System.out.println(m.y);
    }

}
