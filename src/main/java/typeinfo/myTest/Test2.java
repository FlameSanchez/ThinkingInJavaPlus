package typeinfo.myTest;

import javax.jws.soap.SOAPBinding;
import javax.sound.midi.Soundbank;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
class Test3{
    public void p() {
        System.out.println("1");
    }
    public static void p(int...a) {
        int sum=0;
        for (int i : a) {
            sum += i;
        }
        System.out.println(sum);
    }
    public void p1() {
        System.out.println("2");
    }
    public void p2() {
        System.out.println("3");
    }
}
public class Test2 {



    public static void main(String[] args)  {
//        String[] s = {"p","p1","p2"};
//        Class<? extends Test2> aClass = test2.getClass();
        //            Class<?> test21 = Class.forName("typeinfo.myTest.Test2");

        Test3 test3 = new Test3();
        Method m = null;
        Method m1 = null;
        try {
            m = Test3.class.getMethod("p",(Class[])null);
            m1 = Test3.class.getMethod("p",int[].class);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            m.invoke(test3, (Object[])null);
            m1.invoke(null, new int[]{2,3,4});

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
