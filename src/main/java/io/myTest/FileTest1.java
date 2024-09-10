package io.myTest;

import java.io.File;

public class FileTest1 {


    public static void main(String[] args) {
        File file = new File("F:\\games02\\a");
//        System.out.println(file.mkdir());
        System.out.println(file.mkdirs());

    }
}
