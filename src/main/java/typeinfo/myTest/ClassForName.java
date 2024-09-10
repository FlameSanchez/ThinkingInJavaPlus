package typeinfo.myTest;

public class ClassForName {


    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("strings.BetterRead");
        System.out.println(aClass.getName());

    }
}
