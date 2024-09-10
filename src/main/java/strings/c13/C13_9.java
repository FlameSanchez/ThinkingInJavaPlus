package strings.c13;

import strings.Splitting;

public class C13_9 {



    public static void main(String[] args) {

        String knights = Splitting.knights;

        String s1 = knights.replaceAll("[aeiou]", "/");
        System.out.println(s1);
    }
}
