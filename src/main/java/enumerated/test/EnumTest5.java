package enumerated.test;


import net.mindview.util.OSExecute;

import static net.mindview.util.Print.print;
//enum访问外部类成员

    public class EnumTest5 {

// void f1(LikeClasses.WINKEN instance) {} // Nope

        int y;
       static int sy;

        void test() {

        }
        static void stest() {

        }

        enum LikeClasses {

            WINKEN { void behavior() { print("Behavior1"); } },
            BLINKEN { void behavior() { print("Behavior2"); } },
            NOD { void behavior() { print("Behavior3"); } };

            abstract void behavior();

            int x;
            static int sx;

            void testx() {
                EnumTest5 enumTest5 = new EnumTest5();
                enumTest5.y=1;
                enumTest5.test();

            }
            public static void main(String[] args) {
                OSExecute.command("javap G:\\java\\IDEAWorkSpace\\thinkingInJava\\thinkj\\target\\classes\\enumerated\\test\\EnumTest5$LikeClasses.class");

            }

        }

    }
