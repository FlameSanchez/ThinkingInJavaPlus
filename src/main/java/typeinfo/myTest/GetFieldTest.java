package typeinfo.myTest;

import innerclasses.c10.C10_11.Clas;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetFieldTest {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {

        Class<?> a = Class.forName("strings.ArrayListDisplay");
        Object o = a.newInstance();
        Field x = a.getDeclaredField("x");
       //get field value
        x.setAccessible(true);
        System.out.println(x.getInt(o));

        //set field value
        x.setInt(o, 4);
        System.out.println(x.getInt(o));

        //show fields name
        for (Field field : a.getDeclaredFields()) {
            System.out.println(field.getName());
        }

        //show methods name
        for (Method method : a.getDeclaredMethods()) {
            System.out.println(method.getName());
        }

        //invoke method
        String[] strings = new String[]{"132","one","123"};
        Method method = a.getDeclaredMethod("test1",String[].class);
        method.setAccessible(true);
        method.invoke(o,(Object) strings);

    }
}
