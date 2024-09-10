package typeinfo.myTest;

import typeinfo.toys.ToyTest;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//得到一个类的所有层次的父类及接口 C14_8.java
class Test1 extends Test {
     String word = "i love you";
     String word2 = "fuck you";

    void test() {
        System.out.println(word);
    }
    void test1() {
        System.out.println(word);
    }

}
class Test1a extends Test {

}
public class Test {
    int i;
    @Override
    public String toString() {
        return "Test09{" +
                "i=" + i +
                '}';
    }

    public static void main(String[] args) {
        List<Test> tests = Arrays.asList(new Test1(), new Test1a());


//        Class.forName()
//        Test09 test = new Test09();
//        test.getClass();
//
        Test test = new Test();
        Test1 test1 = new Test1();
        Test1a test1a = new Test1a();
        System.out.println((test1 instanceof Test));
        test1.i=3;
        System.out.println(test1);
        System.out.println(test1a.i);
//        ToyTest toyTest = new ToyTest();
//        Class ownerClass =toyTest.getClass();
//        Field field = ownerClass.getField("y");
//     Object property = field.get(owner);


        System.out.println((ArrayList.class.isInstance(new Test1a()) ));
    }
}
