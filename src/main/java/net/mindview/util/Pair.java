//: net/mindview/util/Pair.java
package net.mindview.util;
//这个类专门为了满足map.put()对Generator.next()产生键值对的要求而设计的类
public class Pair<K,V> {
  public final K key;
  public final V value;
  public Pair(K k, V v) {
    key = k;
    value = v;
  }
} ///:~
