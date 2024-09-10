package containers;//: containers/MapDataTest.java
import java.util.*;
import java.util.jar.JarEntry;

import net.mindview.util.*;
import static net.mindview.util.Print.*;

class Letters implements Generator<Pair<Integer,String>>,
  Iterable<Integer> {
  private int size = 9;
  private int number = 1;
  private char letter = 'A';
  public Pair<Integer,String> next() {
    return new Pair<Integer,String>(
      number++, "" + letter++);
  }
  public Iterator<Integer> iterator() {
    return new Iterator<Integer>() {
      public Integer next() { return number++; }
      public boolean hasNext() { return number < size; }
      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
  }
  public static void main(String[] args) {
//    Letters letters = new Letters();
//    for (Integer integer : letters) {
//      System.out.println(integer);
//    }
    LinkedHashMap<Integer, String> map= new MapData<>(new Letters(), 3);
    LinkedHashMap<String, Integer> map1= new MapData<>(new RandomGenerator.String(3), new RandomGenerator.Integer(3), 3);
    LinkedHashMap<String, Character> map2= new MapData<>(new RandomGenerator.String(3),'e', 3);
    LinkedHashMap<Integer, Character> map3= new MapData<>(new Letters(),new RandomGenerator.Character());
    HashMap<Object, Object> hashMap = new HashMap<>(map);
    System.out.println(hashMap);
//    LinkedHashMap<Integer, Integer> map4= new MapData<>(new Letters(), (Integer)31);
    System.out.println(map);
    System.out.println(map1);
    System.out.println(map2);
    System.out.println(map3);
    MapData.map(new Letters(), 3);
    MapData.map(new Letters(), (Integer)31);

  }
}

public class MapDataTest {
  public static void main(String[] args) {
    // Pair Generator:
    print(MapData.map(new Letters(), 11));
    // Two separate generators:
    print(MapData.map(new CountingGenerator.Character(),
      new RandomGenerator.String(3), 8));
    // TwoDimensionalArray key Generator and a single value:
    print(MapData.map(new CountingGenerator.Character(),
      "Value", 6));
    // An Iterable and a value Generator:
    print(MapData.map(new Letters(),
      new RandomGenerator.String(3)));
    // An Iterable and a single value:
    print(MapData.map(new Letters(), "Pop"));
  }
} /* Output:
{1=TwoDimensionalArray, 2=B, 3=C, 4=D, 5=E, 6=F, 7=G, 8=H, 9=I, 10=J, 11=K}
{a=YNz, b=brn, c=yGc, d=FOW, e=ZnT, f=cQr, g=Gse, h=GZM}
{a=Value, b=Value, c=Value, d=Value, e=Value, f=Value}
{1=mJM, 2=RoE, 3=suE, 4=cUO, 5=neO, 6=EdL, 7=smw, 8=HLG}
{1=Pop, 2=Pop, 3=Pop, 4=Pop, 5=Pop, 6=Pop, 7=Pop, 8=Pop}
*///:~