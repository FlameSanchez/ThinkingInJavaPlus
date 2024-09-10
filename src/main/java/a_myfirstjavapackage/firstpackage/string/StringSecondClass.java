package a_myfirstjavapackage.firstpackage.string;


import java.util.StringJoiner;

public class StringSecondClass {
    //String类 concat() trim() substring() StringBuffer StringBuilder
    public static void main(String[] args) {
        String s = "abcdefgh  a";
        String s2 = "ijklmnop";

//        replace()
        String replace = s.replace("bc", "cb");
        System.out.println(replace);

//       split()
        String[] s1 = s.split(" ");
        System.out.println(s1.length);
        for (String string :s1 ) {
            System.out.println(string);
        }

/*
//      string index startwith "0"

        System.out.println(s.toUpperCase());

        System.out.println(s.trim());
        System.out.println(s.concat(s2));

        //index start from 0
        //substring start from 1
        System.out.println(s.length() + "\t" + s2.length());
        //charat() indexof()
        System.out.println(s.indexOf("a"));
        System.out.println(s.charAt(1));
        System.out.println(s.substring(1, 3));
        System.out.println(s.substring(s.indexOf("h"), s.length()));

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }*/

//       codePointAt() Unicode代码点值
        System.out.println(s.codePointAt(2));

//      getchars()
        char sgetchars[] = s.toCharArray();
s2.getChars(0,s2.length(),sgetchars,1);
        System.out.println(sgetchars);

//    StringBuffer(线程不安全) stringbuilder(线程安全,更高效)
//     sb.append() sb.reverse() sb.toString() sb.length()
         StringBuilder sb = new StringBuilder();

         //        StringJoiner



    }
}