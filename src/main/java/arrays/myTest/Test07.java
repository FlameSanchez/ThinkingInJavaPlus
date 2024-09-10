package arrays.myTest;

import java.math.BigDecimal;
import java.util.Arrays;

//bigdecimal
// high performance copy array tool
public class Test07 {


    public static void main(String[] args) {
        BigDecimal ads;
        int[] i = new int[5];
        int[] j = new int[9];
        Arrays.fill(i, 44);

        System.arraycopy(i,0,j,0,i.length);

        System.out.println(Arrays.toString(j));


    }
}
