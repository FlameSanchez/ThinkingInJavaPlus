package initialization;

//: initialization/MethodInit2.java

/**
 *
 */
public class MethodInit2 {
  int i = f();
  int j = g(i);

  /**
   *
   * @return
   */
  int f() { return 11; }
  int g(int n) { return n * 10; }
} ///:~
