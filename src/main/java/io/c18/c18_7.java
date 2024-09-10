package io.c18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class c18_7 {

//    public static String
//    read(String filename) throws IOException {
//        // Reading input by lines:
//        BufferedReader in = new BufferedReader(
//                new FileReader(filename));
//        String s;
//        LinkedList<String> sb = new LinkedList<String>();
//        while((s = in.readLine())!= null)
//            sb.add(s + "\n");
//        in.close();
//        Collections.reverse(sb);
//        return sb.toString();
//    }
//    public static void main(String[] args)
//            throws IOException {
//        System.out.print(read("G:\\java\\IDEAWorkSpace\\thinkingInJava\\thinkj\\src\\main\\java\\io\\BufferedInputFile.java"));
//    }
    public static List<String>
    read(String filename) throws IOException {
    // Reading input by lines:
        BufferedReader in = new BufferedReader(
                new FileReader(filename));
        String s;
        List<String> list = new LinkedList<String>();
        while((s = in.readLine())!= null)
            list.add(s);
        in.close();
        return list;
    }

    public static void main(String[] args) throws IOException {

        List<String> list= read("G:\\java\\IDEAWorkSpace\\thinkingInJava\\thinkj\\src\\main\\java\\io\\BufferedInputFile.java");

        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
