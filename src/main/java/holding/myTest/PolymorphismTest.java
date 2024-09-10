package holding.myTest;


import java.util.LinkedList;
import java.util.List;

public class PolymorphismTest {


    public static void main(String[] args) {
    //   Father s=new Son();//s只能调用Father的资源，除非(Son)s

        List apples = new LinkedList();
        ((LinkedList) apples).addFirst(1);
        ((LinkedList) apples).addLast(2);

        LinkedList apples1 = new LinkedList();
        apples1.addFirst(3);
        apples1.addLast(4);
    }
}
