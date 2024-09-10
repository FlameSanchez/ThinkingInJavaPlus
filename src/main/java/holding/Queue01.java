package holding;

import java.util.Arrays;
import java.util.List;

public class Queue01 {
    public static void main(String[] args) {

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));

        for (String string : strings) {
            System.out.print(string+"   ");
        }
    }
}
