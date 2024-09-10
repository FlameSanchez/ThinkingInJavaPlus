package arrays;//: arrays/AlphabeticSearch.java
// Searching with a comparator.
import java.util.*;
import net.mindview.util.*;
//binarySearch() 适用于已经排序的数组,在无序下，找不到元素结果不确定，有序下，找不到的值是-ip-1
//在Arrays.sort(）是overload加了String.CASE_INSENSITIVE_ORDER在binarySearch()时也要overload加String.CASE_INSENSITIVE_ORDER
public class AlphabeticSearch {
  public static void main(String[] args) {
    String[] sa = Generated.array(new String[30],
            new RandomGenerator.String(5));
    Arrays.sort(sa,String.CASE_INSENSITIVE_ORDER);
    System.out.println(Arrays.toString(sa));
    int index = Arrays.binarySearch(sa, sa[10],String.CASE_INSENSITIVE_ORDER);
    System.out.println("Index: "+ index + "\n"+ sa[index]);
  }
} /* Output:
[bkIna, cQrGs, cXZJo, dLsmw, eGZMm, EqUCB, gwsqP, hKcxr, HLGEa, HqXum, HxxHv, JMRoE, JmzMs, Mesbt, MNvqe, nyGcF, ogoYW, OneOE, OWZnT, RFJQA, rUkZP, sgqia, slJrL, suEcU, uTpnX, vpfFv, WHkjU, xxEAJ, YNzbr, zDyCy]
Index: 10
HxxHv
*///:~
