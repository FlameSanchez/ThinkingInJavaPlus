package typeinfo.c14;

import static net.mindview.util.Print.*;

public class C14_8 {

    static void printClasses(Class<?> c) {
// getSuperclass() returns null on Object:
        if(c == null) return;
        print(c.getName());
// Produces the interfaces that this class
// implements:
        for(Class<?> k : c.getInterfaces()) {
            print("Interface: " + k.getName());
            printClasses(k.getSuperclass());
        }
        printClasses(c.getSuperclass());
    }
    public static void main(String args[]) throws Exception {
        for(int i = 0; i < args.length; i++) {
            print("Displaying " + args[i]);
            printClasses(Class.forName(args[i]));
            if(i < args.length - 1)
                System.out.println("==================");
        }
    }
}