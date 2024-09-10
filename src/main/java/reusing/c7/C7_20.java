//package aapractice;
//
//
//import static net.mindview.util.Print.print;
//
//class WithFinals {
//    // Identical to "private" alone:
//    private final void f() { System.out.println("WithFinals.f()"); }
//    // Also automatically "final":
//    private void g() { System.out.println("WithFinals.g()"); }
//}
//
//
//class OverridingPrivateE20 extends WithFinals {
//    @Override private final void f() {
//        print("OverridingPrivateE20.f()");
//    }
//    @Override private void g() {
//        print("OverridingPrivateE20.g()");
//    }
//}
//class OverridingPrivate2E20 extends OverridingPrivateE20 {
//    @Override public final void f() {
//        print("OverridingPrivate2E20.f()");
//    }
//    @Override public void g() {
//        print("OverridingPrivate2E20.g()");
//    }
//}
//public class A_20 {
//    public static void main(String[] args) {
//        OverridingPrivate2E20 op2 = new OverridingPrivate2E20();
//        op2.f();
//        op2.g();
//    }
//}
//
//
//
//
//
//
