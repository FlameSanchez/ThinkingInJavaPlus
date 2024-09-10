package arrays.myTest;

import net.mindview.util.Generated;
import net.mindview.util.RandomGenerator;

import java.util.Arrays;

import static net.mindview.util.Print.print;

public class ArraysBinarySearchTest {
    public static void main(String[] args) {

        RandomGenerator.Integer gen = new RandomGenerator.Integer();
        RandomGenerator.Integer gen1 = new RandomGenerator.Integer();
        Integer[] array = Generated.array(new Integer[10], gen1);

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        System.out.println(Arrays.binarySearch(array, 1862));

//        while(true) {
//            int r = gen1.next();
//            int location = Arrays.binarySearch(array, r);
//            if(location >= 0) {
//                print("Location of " + r + " is " + location +
//                        ", a[" + location + "] = " + array[location]);
//                break; // Out of while loop
//            }
//        }
    }
}
