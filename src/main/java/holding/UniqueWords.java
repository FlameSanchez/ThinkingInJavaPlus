package holding;//: holding/UniqueWords.java
import java.util.*;
import net.mindview.util.*;

public class UniqueWords {
  public static void main(String[] args) {
    Set<String> words = new TreeSet<String>(
      new TextFile("SetOperations.java", "\\W+"));
//    System.out.println(words);
    System.out.println(words.toString().toCharArray());
  }
} /* Output:
[TwoDimensionalArray, B, C, CollectionsTest, D, E, F, G, H, HashSet, I, J, K, L, M, N, Output, Print, set, SetOperations, String, X, Y, Z, add, addAll, added, args, class, contains, containsAll, false, from, holding, import, in, java, main, mindview, net, new, print, public, remove, removeAll, removed, set1, set2, split, static, to, true, util, void]
*///:~
