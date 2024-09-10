package arrays.myTest;
//试着继承String以重写toString() 然而final修饰了String类
//!!!error
//class String1 extends java.lang.String {
//!!!
//String类最好别创建 这样会覆盖同包内所有类的main方法！
//}

public class String1 {

    int i;
//toString的返回值必须是String
//    @Override
//    public String  toString() {
//        return this;
//    }

    public String1(int i) {
        this.i = i;
    }

}
