package enumerated.test;

import net.mindview.util.OSExecute;

public class InnerClassTest {
    int y;
    static int sy;

    void testy() {
        X xx = new X();
        xx.x=2;
        xx.testx();
    }
    static void stesty() {

    }

    class X{
        int x;

        void testx() {
            y=2;
            testy();

        }
    }
    public static void main(String[] args) {

        OSExecute.command("javap G:\\java\\IDEAWorkSpace\\thinkingInJava\\thinkj\\target\\classes\\enumerated\\test\\InnerClassTest$X.class");

    }
}
