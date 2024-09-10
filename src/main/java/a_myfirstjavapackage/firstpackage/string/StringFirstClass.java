package a_myfirstjavapackage.firstpackage.string;

import a_myfirstjavapackage.firstpackage.arrays.ArrayFirstClass;

public class StringFirstClass extends ArrayFirstClass {
    public static void main(String[] args) {

        String s = "hello";
        s = "name";
        System.out.println(s);

        //串池
        String s1 ="abc";
        String s2 ="abc";
        System.out.println(s1==s2);//true

        String s3 =new String("abc");
        String s4 =new String("abc");
        System.out.println(s3==s4);//false

        String a ="abc";
        //有变量参与 产生新的字符串
        String b ="a";
        String c =b+"bc";
        //没有变量参与 字符串直接相加 然后去串池去找
        String d ="a"+"b"+"c";
        System.out.println(a==c);//false
        System.out.println(a==d);//true


        //数值类型数组,char[]数组相互转换
//       tochararray()   string--->char[]
//       string(char[])  char[]--->string

//       string(bytes[])  bytes[]--->string


    }
}
