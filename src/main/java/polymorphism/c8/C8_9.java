package polymorphism.c8;

public class C8_9 {
   static Rodent[] rodents={new Mouse(),new Gerbil()};

    public static void main(String[] args) {
        for (Rodent rodent : rodents) {
         rodent.eat();
         rodent.run();
        }
    }

}
class Rodent{
    void eat(){
        System.out.println("eat");
    }
    void run(){
        System.out.println("run");
    }
}
class Mouse extends Rodent{
    void eat(){
        System.out.println("MouseEat");
    }
    void run(){
        System.out.println("MouseRun");
    }
}
class Gerbil extends Rodent{
    void eat(){
        System.out.println("GerbilEat");
    }
    void run(){
        System.out.println("GerbilRun");
    }
}