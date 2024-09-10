package typeinfo.myTest;

import java.util.ArrayList;

import static net.mindview.util.Print.print;
class Test5 extends Test4 implements Runnable{
    public void p() {
        System.out.println("1");
    }

    @Override
    public void run() {

    }
}
public class Test4 {
    static void printClasses(Class<?> c) {
      if(c == null) return;
      print(c.getName());
    for(Class<?> k : c.getInterfaces()) {
        print("Interface: " + k.getName());
        printClasses(k.getSuperclass());
    }
        printClasses(c.getSuperclass());
}

    public static void main(String[] args) {
//        printClasses(Test5.class);
        printClasses(ArrayList.class);
        printClasses(Character[].class);
    }

}
