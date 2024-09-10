package arrays.c16;

import net.mindview.util.ConvertTo;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generated;

import java.util.Arrays;

public class C16_12 {

    public static void main(String[] args) {
        Double[] array = Generated.array(Double.class, new CountingGenerator.Double(), 5);
        System.out.println(Arrays.toString(array));
        }
}
