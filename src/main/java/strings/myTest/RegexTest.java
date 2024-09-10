package strings.myTest;

import strings.Splitting;

public class RegexTest {

    public static void main(String[] args) {

//        System.out.println("abr".matches("-?\\w+"));
        System.out.println("hbr19  ".matches("[a-z&&[hij]]br[\\d]+[\\s]+"));
        System.out.println("e".matches("[aeiou]{2,4}"));
        System.out.println("e".replaceAll("[aeiou]","/"));

        String knights = Splitting.knights;
        System.out.println(knights);

//        for (String s1 : split) {
            StringBuilder s = new StringBuilder();
//
//            if (s1.matches("[aeiou]")) {
//                System.out.print(s1);
//                s1.replace("s1","/" );
//            }
//        }

//        for (String s : split) {
//            System.out.print(s);
//
//        }
    }
}
