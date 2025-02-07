package holding.c11.c11_16;

import net.mindview.util.TextFile;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static net.mindview.util.Print.print;

public class E16_Vowels {
    private final static Set<Character> vowels =
            new HashSet<Character>(Arrays.asList('a', 'e', 'o', 'u',
                    'i', 'A', 'E', 'O', 'U', 'I'));
    public static void main(String[] args) {
        HashSet<String> processedWords = new HashSet<String>();
        int fileVowels = 0;
        int wordVowels;
        for(String word :
                new TextFile("E16_Vowels.java", "\\W+")) {
            wordVowels = 0;
            for(char letter : word.toCharArray())
                if(vowels.contains(letter))
                    wordVowels++;
            if(!processedWords.contains(word)) {
                processedWords.add(word);
                print(word + " has " + wordVowels + " vowel(s)");
            }
            fileVowels += wordVowels;
        }
        print("Total number of vowels in file: " + fileVowels);
    }
}
