package holding.c11;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.lang.reflect.Method;
import java.util.*;

public class Test   {
    static <T> void test(Iterable<T> ib) {
        for(T t : ib)
            System.out.print(t + " ");
    }
    static void method(Class type){
        for (Method method : type.getMethods()) {
            System.out.print(method.getName()+"\t");
        }
        System.out.println();

//        for (Class aClass : type.getInterfaces()) {
//            System.out.println(aClass.getName());
//        }

//        System.out.println(type.getName());
//        System.out.println(type.getSimpleName());

    }


    public static void main(String[] args) {

//        String[]s={"a","b","c"};

        method(HashSet.class);
        method(Set.class);
        method(Objects.class);

    }



}
