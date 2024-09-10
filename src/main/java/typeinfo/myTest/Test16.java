package typeinfo.myTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;

import static net.mindview.util.Print.print;

public class Test16 {

    public static void main(String[] args) {
        try {
            Class<?> alist = Class.forName("java.util.ArrayList");
            Method[] methods = alist.getMethods();
            for (Method method : methods) {
                System.out.println(method);
            }
            print();
            Constructor<?>[] constructors = alist.getConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
