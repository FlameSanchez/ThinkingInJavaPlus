package generics.myTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test09 {

    public static void main(String[] args) {
        Random r = new Random(250);
        System.out.println(r.nextBoolean());
        System.out.println(r.nextInt(5));
        System.out.println(r.nextLong());
        Set<Character> mySet =
                new HashSet(Arrays.asList());
    }

}
