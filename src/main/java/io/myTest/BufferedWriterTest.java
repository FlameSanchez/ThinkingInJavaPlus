package io.myTest;

import java.io.*;

public class BufferedWriterTest {


    public static void main(String[] args) throws IOException {

        BufferedWriter bw= new  BufferedWriter(new FileWriter("F:\\games02\\test.txt"));
//        BufferedReader br = new BufferedReader(new FileReader("G:\\java\\IDEAWorkSpace\\thinkingInJava\\thinkj\\src\\main\\java\\io\\myTest\\OutputStreamTest.java"));

//        String s;
//        while ((s = br.readLine())!=null) {
//            bw.write(s+"\n");
//        }
//        bw.close();
//        br.close();

        bw.write("hey11");
        bw.write("hey12");
        bw.close();






    }
}
