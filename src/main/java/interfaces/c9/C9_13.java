package interfaces.c9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class C9_13 extends C9_10 implements Readable {

    private int count;

    public C9_13(int count) {
        test();
        this.count = count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new C9_13(6));
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0)
            return -1;
        char[] chars = "helloworld".toCharArray();
//        for (char c : chars) {
//            cb.append(c);
//        }

            cb.put(chars);

        cb.append(" ");
        return 1;
    }
}
