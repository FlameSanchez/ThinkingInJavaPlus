package aapractice;

import static net.mindview.util.Print.*;

class Gun extends  Test {
    public  int i=0;
    public  static int k=0;
    public    int j=k++;
    void play(){
        System.out.println("Gun");
    }

    public Gun( ) {
       print("Gun{" +
               "j=" + j +
               '}');
    }

    @Override
    public String toString() {
        return "Gun{" +
                "j=" + j +
                '}';
    }
}
public class Test {
    public  int i=1;
    public  final int j=2;
    public  static int k=3;
    void play(){
        System.out.println("aapractice.equals.Test09");
    }

    public static void main(String[] args) {
        //1
        Test gun = new Gun();
        Gun gun1 = new Gun();
        System.out.println(gun.i+"\t"+gun1.i+gun.j+"\t"+gun1.j+gun.k+"\t"+gun1.k);
        gun.play();
        gun1.play();
        //2
       Gun[] guns={new Gun(),new Gun(),new Gun(),new Gun(),new Gun(),new Gun(),new Gun()};

        for (Gun g : guns) {
                print(g.k);
                print(g);
        };



    }
}
