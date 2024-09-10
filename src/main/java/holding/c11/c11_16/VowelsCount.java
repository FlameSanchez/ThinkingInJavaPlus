package holding.c11.c11_16;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

public class VowelsCount {


    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(
                new TextFile("UniqueWords.java", "\\W+"));
        String[] chars= (String[]) words.toArray();
        System.out.println(chars);


    }
}
