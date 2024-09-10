package arrays.c16;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Arrays;

/*
Create a class with an int field that’s initialized from a constructor argument. Create two arrays of these objects,
using identical initialization values for each array, and show that Arrays.equals( ) says that they are unequal.
Add an equals( ) method to your class to fix the problem.
 */
class C16_20{
    private int i;

    public C16_20(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof C16_19 && i==((C16_19)obj).i) {
            return true;
        }
        return super.equals(obj);
    }


}
public class C16_19 {

    int i;

    public C16_19(int i) {
        this.i = i;
    }
//  !!! (C16_19)obj).i
    //答案是这个，但是有bug,
    @Override
    public boolean equals(Object obj) {
            if (obj instanceof C16_19 && i==((C16_19)obj).i) {
                return true;
        }
        return super.equals(obj);
    }

    public static void main(String[] args) {
        C16_19[] c1 = new C16_19[5];
        C16_19[] c2 = new C16_19[5];
        Arrays.fill(c1, new C16_19(3));
        Arrays.fill(c2, new C16_19(3));
        System.out.println(Arrays.equals(c1, c2));
        C16_20[] c3 = new C16_20[5];
        Arrays.fill(c3, new C16_20(3));
        System.out.println(Arrays.equals(c2, c3));
        C16_19 c16_19 = new C16_19(1);
        C16_20 c16_20 = new C16_20(1);
        System.out.println(c16_20.equals(c16_19));
        System.out.println(c16_19.equals(c16_20));
        System.out.println(Arrays.binarySearch(c1, 3));


        //记住这个奇葩
//        String s1 = new String("ha");
//        String s2 = new String("ha");
//        System.out.println(s1.equals(s2));


    }
}
