package typeinfo;//: typeinfo/ClassCasts.java

class Building {
  int y=12;
}
class House extends Building {
  int x=11;
}

public class ClassCasts {

  public static void main(String[] args) {
    Building b = new House();
    Class<House> houseType = House.class;
    House h = houseType.cast(b);
    h = (House)b; // ... or just do this.
    if (b instanceof House) {
      System.out.println(((House) b).x);
    }
    if (h instanceof Building) {
      System.out.println(h.y);
    }
  }
} ///:~
