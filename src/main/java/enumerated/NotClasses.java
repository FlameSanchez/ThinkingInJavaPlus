package enumerated;//: enumerated/NotClasses.java
// {Exec: javap -c LikeClasses}
import net.mindview.util.OSExecute;

import static net.mindview.util.Print.*;

enum LikeClasses {
  WINKEN { void behavior() { print("Behavior1"); } },
  BLINKEN { void behavior() { print("Behavior2"); } },
  NOD { void behavior() { print("Behavior3"); } };
  abstract void behavior();

}

public class NotClasses {
  //   void f1(LikeClasses.WINKEN instance) {} // Nope
  void test() {
    LikeClasses winken = LikeClasses.WINKEN;
  }

  public static void main(String[] args) {
    OSExecute.command("javap G:\\java\\IDEAWorkSpace\\thinkingInJava\\thinkj\\target\\classes\\enumerated\\test\\EnumTest5$LikeClasses.class");

  }
} /* Output:
Compiled from "NotClasses.java"
abstract class LikeClasses extends java.lang.Enum{
public static final LikeClasses WINKEN;

public static final LikeClasses BLINKEN;

public static final LikeClasses NOD;
...
*///:~
