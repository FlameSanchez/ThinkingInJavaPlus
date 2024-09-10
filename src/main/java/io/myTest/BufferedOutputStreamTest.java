package io.myTest;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {


    public static void main(String[] args) throws IOException {

        BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream("F:\\games02\\asd.txt"));
        bos.write("hello!!!".getBytes());
        bos.close();
    }
}
