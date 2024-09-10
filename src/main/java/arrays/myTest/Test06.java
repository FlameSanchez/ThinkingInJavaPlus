package arrays.myTest;

import net.mindview.simple.List;
import net.mindview.util.CollectionData;
import net.mindview.util.RandomGenerator;

import java.lang.reflect.Array;
import java.util.ArrayList;


//list.toarray(T[])/toarray()
public class Test06 {

    static String[] st=new String[3];

    public static void main(String[] args) {

        ArrayList list = new CollectionData(new RandomGenerator.String(), 3);
        for (Object o : list) {
            System.out.println(o);
        }

//直接toArray()
//        Object[] objects = list.toArray();
//        for (Object object : objects) {
//            System.out.println(object);
//        }

//toArray(T[]) 这样可以转成T[]的数组,而且overwrite T[]数组
//        Object[] objects1 = list.toArray(ch);
        String[] objects1 = (String[])list.toArray(st);

        for (String o: objects1) {
            System.out.println(o);
        }
        for (String s : st) {
            System.out.println(s);
        }







    }

}
