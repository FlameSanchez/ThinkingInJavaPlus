package innerclasses.c10.C10_23;
interface U {

    void u1();
    void u2();
    void u3();
}
class A{
    U a(){
        return new U() {
            @Override
            public void u1() {

            }

            @Override
            public void u2() {

            }

            @Override
            public void u3() {

            }
        };
    }
}

class B{
    U []u1;
    void add(U u){
       u1[0]=u;
    }
}
public class Test {


}
