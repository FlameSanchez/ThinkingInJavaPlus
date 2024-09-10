package io.myTest;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class InputStreamTest {


    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("G:\\java\\IDEAWorkSpace\\thinkingInJava\\thinkj\\src\\main\\java\\io\\myTest\\InputStreamTest.java");
        System.out.println(fileInputStream.read());
    }
}
