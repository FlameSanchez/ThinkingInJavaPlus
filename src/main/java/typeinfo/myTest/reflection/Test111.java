package typeinfo.myTest.reflection;

import typeinfo.myTest.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
//测试反射用于非public类
public class Test111 {


    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        try {

            Class<?> aClass = Class.forName("typeinfo.myTest.Test1");
            try {
                Field field = aClass.getDeclaredField("word");
                System.out.println(field);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            //属性
            Field[] dFields = aClass.getDeclaredFields();
           //父类方法
            Method[] methods = aClass.getMethods();
            //方法
            Method[] dMethods = aClass.getDeclaredMethods();
//            for (Method method : methods) {
//                System.out.println(method.getName() + "\t" + method.getReturnType());
//            }
            for (Method dmethod : dMethods) {
                System.out.println(dmethod.getName() + "\t" + dmethod.getReturnType());
            }
            for (int i = 0; i < dFields.length; i++) {
                dFields[i].setAccessible(true);
//                System.out.println(dFields[i].getName() +"\t"+ dFields[i].get(test1));
            }
            System.out.println(aClass+"\n"+aClass.getName()+"\n");
        } catch (ClassNotFoundException e) {


        }
    }
}
