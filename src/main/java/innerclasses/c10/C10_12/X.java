package innerclasses.c10.C10_12;

public abstract class X {

    void del(){
        System.out.println("1");
    }

    public X() {
    }

    abstract void del1();

}
class D extends X{

    @Override
    void del1() {

    }
}