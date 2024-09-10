package innerclasses.c10.C10_19;

import innerclasses.c10.C10_5;

public class Test extends C10_5 {

    class Tes extends C10_5 implements A,B{

    }
    static  class Tes1 extends Test implements A,B{

    }

    A a = new A() {
    };
}
interface A{

}
interface B{

}