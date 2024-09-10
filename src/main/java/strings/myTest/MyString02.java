package strings.myTest;

import java.util.Arrays;

public class MyString02 {


    public static void main(String[] args) {

        String s = "hello my world!";

        String[] split = s.split(" ");

        System.out.println(Arrays.toString(split));
//        for (String s1 : split) {
//            System.out.println(s1);
//        }
    }
}
