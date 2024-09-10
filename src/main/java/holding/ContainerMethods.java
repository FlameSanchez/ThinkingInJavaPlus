package holding;//: holding/ContainerMethods.java
import net.mindview.util.*;

public class ContainerMethods {
  public static void main(String[] args) {
    ContainerMethodDifferences.main(args);
  }
} /* Output: (Sample)
collection: [add, addAll, clear, contains, containsAll, equals, hashCode, isEmpty, iterator, remove, removeAll, retainAll, size, toArray]
Interfaces in collection: [Iterable]
set extends collection, adds: []
Interfaces in set: [collection]
HashSet extends set, adds: []
Interfaces in HashSet: [set, Cloneable, Serializable]
LinkedHashSet extends HashSet, adds: []
Interfaces in LinkedHashSet: [set, Cloneable, Serializable]
TreeSetTest extends set, adds: [pollLast, navigableHeadSet, descendingIterator, lower, headSet, ceiling, pollFirst, subSet, navigableTailSet, comparator, first, floor, last, navigableSubSet, higher, tailSet]
Interfaces in TreeSetTest: [NavigableSet, Cloneable, Serializable]
list extends collection, adds: [listIterator, indexOf, get, subList, set, lastIndexOf]
Interfaces in list: [collection]
ArrayList extends list, adds: [ensureCapacity, trimToSize]
Interfaces in ArrayList: [list, RandomAccess, Cloneable, Serializable]
LinkedList extends list, adds: [pollLast, offer, descendingIterator, addFirst, peekLast, removeFirst, peekFirst, removeLast, getLast, pollFirst, pop, poll, addLast, removeFirstOccurrence, getFirst, element, peek, offerLast, push, offerFirst, removeLastOccurrence]
Interfaces in LinkedList: [list, Deque, Cloneable, Serializable]
Queue extends collection, adds: [offer, element, peek, poll]
Interfaces in Queue: [collection]
PriorityQueue extends Queue, adds: [comparator]
Interfaces in PriorityQueue: [Serializable]
map: [clear, containsKey, containsValue, entrySet, equals, get, hashCode, isEmpty, keySet, put, putAll, remove, size, values]
HashMap extends map, adds: []
Interfaces in HashMap: [map, Cloneable, Serializable]
LinkedHashMap extends HashMap, adds: []
Interfaces in LinkedHashMap: [map]
SortedMap extends map, adds: [subMap, comparator, firstKey, lastKey, headMap, tailMap]
Interfaces in SortedMap: [map]
TreeMap extends map, adds: [descendingEntrySet, subMap, pollLastEntry, lastKey, floorEntry, lastEntry, lowerKey, navigableHeadMap, navigableTailMap, descendingKeySet, tailMap, ceilingEntry, higherKey, pollFirstEntry, comparator, firstKey, floorKey, higherEntry, firstEntry, navigableSubMap, headMap, lowerEntry, ceilingKey]
Interfaces in TreeMap: [NavigableMap, Cloneable, Serializable]
*///:~
