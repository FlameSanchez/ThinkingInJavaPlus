package a_myfirstjavapackage.firstpackage.arrays;

import a_myfirstjavapackage.firstpackage.basics.FirstClass;

import java.util.Arrays;
import java.util.Comparator;

/*
public static String toString(数组)
public static int binarySearch(数组，查找的元素)
public static int[] copyOf(原数组，新数组长度)
public static int[] copyOfRange(原数组，起始索引，结束索引)
public static void fill(数组，元素)
public static void sort(数组)
public static void sort(数组，排序规则)*/
public class ArraysClass {

    public static void main(String[] args) {
        Integer[] a = {23, 4, 3, 4, 6, 1, 4, 43, 546, 2, 8};

//        Arrays.toString(a) 查看数组内容
        Arrays.toString(a);
        Arrays.toString(a);

        //Arrays.binarySearch()
  /*      Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(a, 23));*/
        //数组数字重复查找有问题
       /* Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a, 3));*/

        //Arrays.copyOf()/copyOfRange()
        /*Integer[] b = Arrays.copyOf(a, a.length);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println();
        System.out.println(Arrays.toString(a));*/

//        Arrays.fill(a,3);
        Arrays.fill(a,3);
        System.out.println(Arrays.toString(a));

        //Arrays.sort(a);
/*
        Arrays.sort(a);
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
*/
    }
}
