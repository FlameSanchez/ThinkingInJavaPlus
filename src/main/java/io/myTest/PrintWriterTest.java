package io.myTest;

import java.io.*;

public class PrintWriterTest     {
    public static void main(String[] args) throws IOException {

        String file = "G:\\java\\IDEAWorkSpace\\thinkingInJava\\thinkj\\src\\main\\java\\io\\myTest\\PrintWriterTest1.out";
        BufferedReader br = new BufferedReader(new FileReader("G:\\java\\IDEAWorkSpace\\thinkingInJava\\thinkj\\src\\main\\java\\io\\Alien.java"));
        PrintWriter pw = new PrintWriter(file);
        String s;
        while ((s = br.readLine())!=null) {
            pw.write(s+"\n");
        }
        pw.close();
    }
}
