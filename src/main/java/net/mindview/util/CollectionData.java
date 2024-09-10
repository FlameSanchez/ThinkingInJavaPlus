//: net/mindview/util/CollectionData.java
// TwoDimensionalArray collection filled with data using a generator object.
package net.mindview.util;
import java.util.*;
//collection generator
public class CollectionData<T> extends ArrayList<T> {
  public CollectionData(Generator<T> gen, int quantity) {
    for(int i = 0; i < quantity; i++)
      add(gen.next());
  }
  // TwoDimensionalArray generic convenience method:
  public static <T> CollectionData<T>
  list(Generator<T> gen, int quantity) {
    return new CollectionData<T>(gen, quantity);
  }
} ///:~
