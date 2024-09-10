package typeinfo.c14;

abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() { return "Circle"; }
}

class Square extends Shape {
    public String toString() { return "Square"; }
}

class Triangle extends Shape {
    public String toString() { return "Triangle"; }
}
class Rhomboid extends Shape {
    public String toString() { return "Rhomboid"; }
}
public class C14_4 {
    public static void main(String[] args) {
// Upcast to shape:
        Shape shape = new Rhomboid();
// Downcast to Rhomboid:
        Rhomboid r = (Rhomboid)shape;
// Test09 before Downcasting:
        Circle c = null;
        if(shape instanceof Circle)
            c = (Circle)shape;
        else
            System.out.println("shape not a Circle");
    }
}


