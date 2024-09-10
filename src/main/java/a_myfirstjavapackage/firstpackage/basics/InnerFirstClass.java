package a_myfirstjavapackage.firstpackage.basics;

public class InnerFirstClass {
//类的五大成员：属性,方法,构造方法、代码块、内部类
/*
成员内部类
静态内部类
局部内部类
匿名内部类
*/

    InterfaceTest in=new InterfaceTest(){

        @Override
        public void ss(){
        }

        @Override
        public void ss1() {
        }
    };

    public static void main(String[] args) {
        /*匿名内部类包含了继承或实现，方法重写，创建对象。
        整体就是一个类的子类对象或者接口的实现类对象

        使用场景
        当方法的参数是接口或者类时，
        以接口为例，可以传递这个接口的实现类对象，
        如果实现类只要使用一次，就可以用匿名内部类简化代码。*/
    }
}
