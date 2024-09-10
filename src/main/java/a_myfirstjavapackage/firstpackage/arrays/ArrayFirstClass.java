package a_myfirstjavapackage.firstpackage.arrays;


public class ArrayFirstClass {
    enum a {
      EASTWOOD,HollyWood,Coffee
    }

    final static byte[] bytes = {1, 2, 3, 4};
    final static short[] shorts = {5,6,7,8};
//    public int[] x = new int[5];
    final static int[] ints = {9,10,11,12};
    final static long[] longs = {13,14,15,16};
    private char[] chars = {'l','a','d','y'};
    private static String[] strings = {"a", "ss", "nasa"};


    public static void main(String[] args) {
//        System.out.println(a.Coffee);
//        System.out.println(bytes.length);
        System.out.println(bytes);
        System.out.println(strings);
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
