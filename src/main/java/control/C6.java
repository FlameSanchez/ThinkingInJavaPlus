//package control;
//
//
//import net.mindview.util.Print;
//import reusing.Cleanser;
//
//class DetergentDelegation {
//    private Cleanser cleanser = new Cleanser();
//    // Delegated methods:
//    public void append(String a) { cleanser.append(a); }
//    public void dilute() { cleanser.dilute(); }
//    public void apply() { cleanser.apply(); }
//    public String toString() { return cleanser.toString(); }
//    public void scrub() {
//        append(" DetergentDelegation.scrub()");
//        cleanser.scrub();
//    }
//    public void foam() { append(" foam()"); }
//    public static void main(String[] args) {
//        DetergentDelegation x = new DetergentDelegation();
//        x.dilute();
//        x.apply();
//        x.scrub();
//        x.foam();
//        Print(x);
//        Print("Testing base class:");
//        Cleanser.main(args);
//    }
//}
//public class D {
//    public static void main(String[] args) {
//        DetergentDelegation.main(args);
//    }
//}
//}
//
