package arrays;




import java.lang.reflect.Array;
import java.util.Arrays;

public class C16_1

{

 static    void test(BerylliumSphere[] s) {

    }

    public static void main(String[] args) {
//test({new BerylliumSphere(),new BerylliumSphere()});
test(new BerylliumSphere[]{new BerylliumSphere(),new BerylliumSphere()});
        BerylliumSphere[]b={new BerylliumSphere(),new BerylliumSphere()};
        test(b);

    }
}
