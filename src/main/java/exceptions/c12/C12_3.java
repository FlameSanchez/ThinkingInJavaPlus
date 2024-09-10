package exceptions.c12;

public class C12_3 {


    public static void main(String[] args) {
        int[] a = {1, 3, 2, 5};

        try {
            System.out.println(a[4]);
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
