package io.myTest;

import java.io.*;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest {


    public static void main(String[] args) throws IOException {
//        ZipOutputStream zo = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(new File("file/file.txt"))));
        BufferedReader in = new BufferedReader(
                new FileReader(args[0]));
        BufferedOutputStream out = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("file/file.gz")));
        int c;
        while((c = in.read()) != -1)
            out.write(c);
        in.close();
        out.close();

    }
}
