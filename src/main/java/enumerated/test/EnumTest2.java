package enumerated.test;

import net.mindview.util.Enums;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

enum Signal {
    GREEN, YELLOW, RED;

    void test() {
        System.out.println("1");
    }
    }
public class EnumTest2 {


    Signal color = Signal.RED;


    public static void main(String[] args) {
//        print("c");
//        printnb("a");
//        print("b");
        Signal red = Signal.RED;
        Signal.RED.test();
        for (int i = 0; i <10 ; i++) {
            System.out.println(Enums.random(Signal.class));
        }
    }
}
