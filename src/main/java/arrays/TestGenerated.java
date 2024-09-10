package arrays;//: arrays/TestGenerated.java
import java.util.*;
import net.mindview.util.*;

public class TestGenerated {
  public static void main(String[] args) {
    Integer[] a = { 9, 8, 7, 6 };
    Integer[] a1 = new Integer[4];
    System.out.println(Arrays.toString(a));
    a1 = Generated.array(a,new CountingGenerator.Integer());
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(a1));
    Integer[] b = Generated.array(Integer.class,
        new CountingGenerator.Integer(), 15);
    System.out.println(Arrays.toString(b));
  }
} /* Output:
[9, 8, 7, 6]
[0, 1, 2, 3]
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
*///:~
