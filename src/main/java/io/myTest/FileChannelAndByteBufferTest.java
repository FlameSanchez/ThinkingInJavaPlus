package io.myTest;

import net.mindview.util.Print;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelAndByteBufferTest {


    public static void main(String[] args) throws IOException {


//        FileChannel channel = new FileInputStream("F:\\games02\\test.txt").getChannel();
//        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
//        channel.read(byteBuffer);
//        byteBuffer.flip();
//        while (byteBuffer.hasRemaining()) {
//            System.out.print((char) byteBuffer.get());
//        }
//
//        FileChannel channelWrite = new FileOutputStream("F:\\games02\\test.txt").getChannel();
//        channelWrite.write(ByteBuffer.wrap("abc".getBytes()));
//        channelWrite.close();
//
//        FileChannel channel2 = new FileInputStream("F:\\games02\\test.txt").getChannel();
//        ByteBuffer byteBuffer1 = ByteBuffer.allocate(1024);
//        channel2.read(byteBuffer1);
//        byteBuffer1.flip();
//        System.out.println();
//        while (byteBuffer1.hasRemaining()) {
//            System.out.print((char) byteBuffer1.get());
//        }

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.capacity());
        System.out.println(byteBuffer.mark());
        System.out.println(byteBuffer.reset());


    }
}
