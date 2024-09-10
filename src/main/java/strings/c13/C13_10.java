package strings.c13;



import static net.mindview.util.Print.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class C13_10 {

    public static void main(String[] args) {

        print("Input: \"" + args[0] + "\"");
        for(String arg : args) {
            print("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while(m.find()) {
                print("Match \"" + m.group() + "\" at positions " +
                        m.start() + "-" + (m.end() - 1));
            }
        }
    }
}