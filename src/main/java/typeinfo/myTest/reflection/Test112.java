package typeinfo.myTest.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//测试反射用于public类
public class Test112 {

    public static void main(String[] args) throws IllegalAccessException {
        try {

            Class<?> aClass = Class.forName("typeinfo.myTest.reflection.Test110");
            Test110 test110 = new Test110();
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
                System.out.println(dFields[i].getName() +"\t"+ dFields[i].get(test110));
            }
            System.out.println(aClass+"\n"+aClass.getName()+"\n");
        } catch (ClassNotFoundException e) {


        }
    }
}
