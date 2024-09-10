package containers.myTest;

import containers.TestParam;

import java.util.Arrays;
import java.util.Calendar;

class TestParam1 {
    int x;
    int y;

    public TestParam1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "TestParam1{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
public class FormatTest {

    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        System.out.format("%tB %te, %tY%n", c, c, c);


//        System.out.printf("%25s", "size");
//        System.out.format("%15d", 10);

        TestParam1[] result = new TestParam1[5];
        int n=0;
        int[] values = {1, 2, 3, 4, 5, 6};
        for(int i = 0; i < 3; i++)
            result[i] = new TestParam1(values[n++], values[n++]);

        System.out.println(Arrays.toString(result));
    }
}
