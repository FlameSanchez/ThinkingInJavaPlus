package io.myTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.channels.FileChannel;

public class CharBufferTest {


    public static void main(String[] args) throws IOException {

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        DoubleBuffer doubleBuffer = byteBuffer.asDoubleBuffer();
        doubleBuffer.put(new double[]{1.2d, 2.3d, 2, 1d, 4.2d, 3.14d});
        FileChannel fc = new FileOutputStream("F:\\games02\\test.txt").getChannel();
//        byteBuffer.flip();
//        fc.write(byteBuffer);
//        fc.close();
        System.out.println(doubleBuffer.rewind());
    }
}
