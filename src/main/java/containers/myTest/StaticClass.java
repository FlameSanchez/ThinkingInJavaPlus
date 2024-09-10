package containers.myTest;


class Father {
    static int s=test2();

    static Integer test2() {
        System.out.println("2");
        return 1;
    }
}

//static field会优先加载
public class StaticClass extends Father{

        static String s=test();

        static String test() {
            System.out.println("1");
            return "haha";
        }
    String test1() {
        return s;
    }

    public static void main(String[] args) {
        System.out.println(new StaticClass());


    }
}
