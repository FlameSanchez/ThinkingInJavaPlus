package io.myTest;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {

        RandomAccessFile rw = new RandomAccessFile("F:\\games02\\test.txt", "rw");
            rw.writeChars("jay1");
            rw.writeChars("jay2");
        rw.close();
        System.out.println(rw.readChar());
    }
}
