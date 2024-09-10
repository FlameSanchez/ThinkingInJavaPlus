package io.c18;

import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class c18_10 {

    public static void main(String[] args) throws java.io.IOException {
        if(args.length < 2) {
            System.err.println(
                    "Usage: java E10_FindWords file words");
            return;
        }
        Set<String> words = new HashSet<String>();
        for(int i = 1; i < args.length; i++)
            words.add(args[i]);
        List<String> list = c18_7.read(args[0]);
        for(ListIterator<String> it =
            list.listIterator(list.size()); it.hasPrevious();) {
            String candidate = it.previous();
            for(String word : words)
                if(candidate.indexOf(word) != -1) {
                    System.out.println(candidate);
                    break;
                }
        }
    }
}
