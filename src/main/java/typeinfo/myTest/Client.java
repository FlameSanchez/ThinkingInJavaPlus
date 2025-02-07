package typeinfo.myTest;

import java.lang.reflect.Method;
import java.util.Arrays;


public class Client {
        public static void main(String[] args) throws Exception {
        Class<User> clas=User.class;
        Method m=clas.getMethod("method", String[].class);
        m.invoke(null, new Object[]{new String[]{"aa","bb","cc"}});//静态方法可省略对象，直接用null替代，或用clas

        m=clas.getDeclaredMethod("method", int[].class);//非public方法要用declared获取
        m.setAccessible(true);//非public方法需要设置为可访问
        m.invoke(clas.newInstance(), new int[]{1,2,3,4,3,2,1});//非静态方法需要提供底层的类对象
    }
}

class User{
    public static void method(String...strings){
        System.out.println(Arrays.toString(strings));
    }

    private void method(int...ints){
        System.out.println(Arrays.toString(ints));
    }
}
