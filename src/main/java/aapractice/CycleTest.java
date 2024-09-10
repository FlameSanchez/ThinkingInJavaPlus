package aapractice;



interface Cycle {
    void ride();
}
interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("Unicycle Riding");
    }
}
class UnicycleFactory implements  CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("Bicycle Riding");
    }
}
class BicycleFactory implements  CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("Tricycle Riding");
    }
}
class TricycleFactory implements  CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class CycleTest{
     static void test(CycleFactory cf){
         Cycle cycle = cf.getCycle();
         cycle.ride();
     }

    public static void main(String[] args) {
        test(new UnicycleFactory());
        test(new BicycleFactory());
        test(new TricycleFactory());
    }
}
