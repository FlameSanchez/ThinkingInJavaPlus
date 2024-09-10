package interfaces.c9;

public abstract class C9_11 implements C9_12 {
    @Override
    public void hello() {
        System.out.println("1");
    }
}

//Important!!!:
//package interfaces;//: interfaces/ReferenceCounting.java
//// Cleaning up shared member objects.
//        import static net.mindview.util.Print.*;
//
//class Shared {
//    private int refcount = 0;
//    private static long counter = 0;
//    private final long id = counter++;
//    public Shared() {
//        print("Creating " + this);
//    }
//    public void addRef() { refcount++; }
//    protected void dispose() {
//        if(--refcount == 0)
//            print("Disposing " + this);
//    }
//    public String toString() { return "Shared " + id; }
//}
//
//class Composing {
//    private Shared shared;
//    private static long counter = 0;
//    private final long id = counter++;
//    long num = id+2;
//    public Composing(Shared shared) {
//        print("Creating " + this);
//        this.shared = shared;
//        this.shared.addRef();
//    }
//    protected void dispose() {
//        print("disposing " + this);
////    shared.dispose();
//    }
//    public String toString() { return "Composing " + id+"\t"+num; }
//}
//
//public class ReferenceCounting {
//    public static void main(String[] args) {
//        Shared shared = new Shared();
//        Composing compos= new Composing(shared);
//        Composing compos1= new Composing(shared);
//        Composing compos2= new Composing(shared);
////    System.out.println(compos);
//        Composing[] composing = { compos,
//                compos1, compos,
//                compos, compos };
//        for(Composing c : composing)
//            c.dispose();
//    }}
 /* Output:
Creating Shared 0
Creating Composing 0
Creating Composing 1
Creating Composing 2
Creating Composing 3
Creating Composing 4
disposing Composing 0
disposing Composing 1
disposing Composing 2
disposing Composing 3
disposing Composing 4
Disposing Shared 0
*///:~
