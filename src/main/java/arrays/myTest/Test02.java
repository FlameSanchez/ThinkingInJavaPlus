package arrays.myTest;

import java.util.Arrays;
import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        // 3-D array with fixed length:
        int[][][] a = new int[9][3][3];
        System.out.println(a.length);
        System.out.println(Arrays.deepToString(a));
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(2));

        }
    }
}
