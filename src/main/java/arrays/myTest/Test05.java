package arrays.myTest;

import net.mindview.util.CountingGenerator;
import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Test05 {
    {
        System.out.println("hello");
    }
   static  {
        System.out.println("hello nihao!");
    }

    public static void main(String[] args) {

        CountingGenerator.String string = new CountingGenerator.String(5);
        CountingGenerator.Integer integer = new CountingGenerator.Integer();
        for (int i = 0; i < 5; i++) {
            System.out.println(string.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(integer.next());
        }
        Test05 test05 = new Test05();
//        Generator test051 = (Generator<?>) test05;
//        List test052 = (List) test05;
        RandomGenerator.String string1 = new RandomGenerator.String(3);
        for (int i = 0; i < 5; i++) {
            System.out.println(string1.next());
        }
            new Test05();

    }
}
