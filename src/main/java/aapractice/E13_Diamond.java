package aapractice;

import interfaces.c9.C9_4;

interface BaseInterface {
    void f();
    void f1();
}interface BaseInterface1 {
    void f();
    void f12();
}
interface IntermediateInterface1 extends BaseInterface {

    void a();
}
interface IntermediateInterface2 extends BaseInterface {

    void b();
}
interface CombinedInterface extends IntermediateInterface1, IntermediateInterface2 {
    void b();
}
class CombinedImpl implements CombinedInterface,BaseInterface1, C9_4 {
    public void f() {
        System.out.println("CombinedImpl.f()");
    }

    @Override
    public void f12() {
        System.out.println("12");
    }

    @Override
    public void f1() {

    }

    @Override
    public void b() {

    }

    @Override
    public void a() {

    }

    @Override
    public void test() {
            
    }
}
public class E13_Diamond {
    public static void main(String[] args) {
        new CombinedImpl().f12();
    }
}

