package arrays.myTest;

import net.mindview.util.Generated;
import net.mindview.util.RandomGenerator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
//Arrays.sort() 有多种重载方法，一般都是(T[] t,Comparator<? super T> c),
// 例如 Arrays.sort(T[] t,CollectionsTest.reverseOrder()),
//      Arrays.sort(T[] t,Comparator InnerClasses/Implementation class)
//      Arrays.sort(T[] t,String.CASE_INSENSITIVE_ORDER)
public class ArraysSortTest implements Comparable<Integer> {

    int i;

    public ArraysSortTest(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        Integer[] j = new Integer[5];
        Integer[] a1 = Generated.array(j, new RandomGenerator.Integer()
        );
        System.out.println(Arrays.toString(a1));
        Arrays.sort(a1);

        System.out.println(Arrays.toString(a1));
    }

    @Override
    public int compareTo(Integer o) {

        return i < o ? -1 : ((i == o) ? 0 : 1);
    }
}
