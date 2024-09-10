package strings.c13;

import strings.Groups;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

public class C13_12 {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Set<String> words = new HashSet<String>();
        Matcher m = Pattern.compile("\\b((?![A-Z])\\w+)\\b").matcher(Groups.POEM);
        while(m.find())
            words.add(m.group());
        print("Number of unique words = " + words.size());
        print(words.toString());
    }
//    public static void main(String[] args) {
//        int i=0;
//        Matcher m =Pattern.compile("\\w+").matcher(POEM);
//        Pattern p = Pattern.compile("(^\\p{javaLowerCase}\\w+\\b)");
//        while(m.find()) {
//            Matcher m1 = p.matcher(m.group());
//            if (m1.find()) {
//                i++;
//                printnb("[" + m1.group() + "]");
//            }
//        }
//        print();
//        System.out.println(i);
//    }
}
