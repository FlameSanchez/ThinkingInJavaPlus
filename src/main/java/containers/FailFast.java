package containers;//: containers/FailFast.java
// Demonstrates the "fail-fast" behavior.
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast {
  public static void main(String[] args) {
    Collection<String> c = new ArrayList<String>();
//    Collection<String> c = new CopyOnWriteArrayList<String>();

    Iterator<String> it = c.iterator();
    c.add("An object");
    try {
      String s = it.next();
    } catch(ConcurrentModificationException e) {
      System.out.println(e);
    }
  }
} /* Output:
java.util.ConcurrentModificationException
*///:~
