//: net/mindview/util/TwoTuple.java
package net.mindview.util;

public class TwoTuple<A,B> {
  public final A first;
  public final B second;
  public TwoTuple(A a, B b) { first = a; second = b; }
  public String toString() {
    return "(" + first + ", " + second + ")";
  }

  public static void main(String[] args) {
    TwoTuple<String, Integer> tp = new TwoTuple<>("hello", 10);

    System.out.println(new TwoTuple<String, Integer>("hello1", 101));
  }
} ///:~
