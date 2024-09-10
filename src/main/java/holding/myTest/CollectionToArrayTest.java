package holding.myTest;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
import net.mindview.util.CollectionData;
import net.mindview.util.RandomGenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionToArrayTest {

    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>(CollectionData.list(new RandomGenerator.Integer(), 5));

        System.out.println(arrayList);

        Integer[] integers = arrayList.toArray(new Integer[3]);
        System.out.println(Arrays.toString(integers));


    }
}
