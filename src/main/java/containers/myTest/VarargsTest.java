package containers.myTest;

public class VarargsTest {

    public static int getMax(int... items) {

        return items[1];
    }



        public static void main(String[] args) {

            System.out.println(getMax(3, 4, 1, 1, 1, 1));
//            getMax(new int[3]);
//            getMax(3, 4,new int[3]);





    }
}
