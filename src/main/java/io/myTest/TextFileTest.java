package io.myTest;

import net.mindview.util.TextFile;

import java.util.Arrays;

public class TextFileTest {
    public static void main(String[] args) {


//        System.out.println("afdsfs".split("").length);
//        System.out.println(Arrays.toString("afdsfs".split("")));
        for (String s : new TextFile("G:\\java\\IDEAWorkSpace\\thinkingInJava\\thinkj\\src\\main\\java\\io\\myTest\\TextFileTest.java", "\\W+")) {
            System.out.println(s);

        }
    }
}
