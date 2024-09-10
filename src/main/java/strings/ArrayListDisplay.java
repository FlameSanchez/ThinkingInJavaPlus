package strings;//: strings/ArrayListDisplay.java
import generics.coffee.*;

import javax.xml.transform.Source;
import java.util.*;
public class ArrayListDisplay {

  private int x=3;

  public static void test(String[] args) {
    System.out.println(11);
  }
  public static void test1(String[] args) {
    System.out.println(args[1]);
  }

  public static void main(String[] args) {
    ArrayList<Coffee> coffees = new ArrayList<Coffee>();
    for(Coffee c : new CoffeeGenerator(10))
      coffees.add(c);
    System.out.println(coffees);
  }
} /* Output:
[Americano 0, Latte 1, Americano 2, Mocha 3, Mocha 4, Breve 5, Americano 6, Latte 7, Cappuccino 8, Cappuccino 9]
*///:~
