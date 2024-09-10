package a_myfirstjavapackage.firstpackage.basics;

public class SwitchFirstClass {

    static void test(int x) {

        switch (x) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 5:
                System.out.println(5);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + x);
        }
    }

    public static void main(String[] args) {
        test(Integer.parseInt(args[2]));
    }
}
