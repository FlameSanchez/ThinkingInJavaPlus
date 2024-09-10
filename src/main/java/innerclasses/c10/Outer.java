package innerclasses.c10;

public class Outer {

     class Inner{
     int i=0;
    }

    Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = outer.getInner();
    }
}
