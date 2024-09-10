package zperformanceTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedWriterTest {
    static void BufferedwTest() throws IOException {
//        BufferedWriter bw  = new BufferedWriter(new FileWriter("F:\\games02\\test.txt"));
        PrintWriter bw = new PrintWriter(new BufferedWriter(new FileWriter("F:\\games02\\test.txt")));
        bw.write("hello");
        bw.close();
    }
    static void PrintwTest() throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("F:\\games02\\test.txt"));
        pw.write("hello");
        pw.close();
    }
}
