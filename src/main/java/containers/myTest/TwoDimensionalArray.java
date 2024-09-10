package containers.myTest;

import java.util.Arrays;

public class TwoDimensionalArray {


    public static void main(String[] args) {

        Integer[][] a = new Integer[2][2];
        Integer[][] b = {{2,3},{3,4},{5,6}};
        System.out.println(Arrays.deepToString(a[1]));
        System.out.println(b[1][0]);
//        for (Integer[] integers : a) {
//            for (Integer integer : integers) {
//                System.out.println(integer);
//            }
//        }

    }
}
