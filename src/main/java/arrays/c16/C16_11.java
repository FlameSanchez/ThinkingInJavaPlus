package arrays.c16;

import net.mindview.util.ConvertTo;

import java.util.Arrays;

import static net.mindview.util.Print.print;

public class C16_11 {

    public static Double[] primitive(double[] in) {
        Double[] result = new Double[in.length];
        for(int i = 0; i < in.length; i++)
            result[i] = in[i];
        return result;
    }
    public static void main(String[] args) {
        double[] d = {1.2,2.3,3.4,4.5,5.6};
        Double[] a8 = C16_11.primitive(d);
        print("a8 = " + Arrays.toString(a8));

//        int[] pa = { 1, 2, 3, 4, 5 };
//        Integer[] wa = pa;
//        Integer[] wb = { 1, 2, 3, 4, 5 };
//        int[] pb = wb;
}
}
