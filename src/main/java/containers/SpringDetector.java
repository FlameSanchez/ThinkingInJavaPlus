package containers;//: containers/SpringDetector.java
// What will the weather be?
import containers.myTest.MyTestForPrediction;

import java.lang.reflect.*;
import java.util.*;
import static net.mindview.util.Print.*;
//hashmap在保存的类型没有重写hashcode()和equals()情况下，key可以重复
public class SpringDetector {
  // Uses a Groundhog or class derived from Groundhog:
  public static <T extends Groundhog>
  void detectSpring(Class<T> type) throws Exception {
    Constructor<T> ghog = type.getConstructor(int.class);
    Map<Groundhog,Prediction> map =
      new HashMap<Groundhog,Prediction>();
    for(int i = 0; i < 10; i++)
      map.put(ghog.newInstance(i), new Prediction());

    map.put(ghog.newInstance(9), new MyTestForPrediction());
    System.out.println("map.keySet()"+map.keySet());
    print("map = " + map);
    Groundhog gh = ghog.newInstance(3);
//    map.containsKey(map.);
    print("Looking up prediction for " + gh);
    if(map.containsKey(gh))
      print(map.get(gh));
    else
      print("Key not found: " + gh);
  }
  public static void main(String[] args) throws Exception {
    detectSpring(Groundhog2.class);
  }
} /* Output:
map = {Groundhog #3=Early Spring!, Groundhog #7=Early Spring!, Groundhog #5=Early Spring!, Groundhog #9=Six more weeks of Winter!, Groundhog #8=Six more weeks of Winter!, Groundhog #0=Six more weeks of Winter!, Groundhog #6=Early Spring!, Groundhog #4=Six more weeks of Winter!, Groundhog #1=Six more weeks of Winter!, Groundhog #2=Early Spring!}
Looking up prediction for Groundhog #3
Key not found: Groundhog #3
*///:~
