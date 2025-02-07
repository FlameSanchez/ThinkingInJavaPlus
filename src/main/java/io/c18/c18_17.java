package io.c18;

import net.mindview.util.TextFile;

import java.util.*;

public class c18_17 {

    void read(String file) {

        Map<Character, Integer> map = new HashMap<>();

        TextFile textFile = new TextFile(file, "");


    }

    public static void main(String[] args) {
        Map<Character,Integer> charsStat =
                new HashMap<Character,Integer>();
        for(String word :
                new TextFile("E17_CharactersInfo.java", "\\W+"))
            for(int i = 0; i < word.length(); i++) {
                Character ch = word.charAt(i);
                Integer freq = charsStat.get(ch);
                charsStat.put(ch, freq == null ? 1 : freq + 1);
            }
        List<Character> keys = Arrays.asList(
                charsStat.keySet().toArray(new Character[0]));
        Collections.sort(keys);
        for(Character key : keys)
            System.out.println(key + " => " + charsStat.get(key));
    }
}
