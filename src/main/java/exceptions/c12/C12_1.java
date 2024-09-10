package exceptions.c12;

public class C12_1 {

    public static void main(String[] args) {

        try {
            throw new Exception("demo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("demo1");
        }


    }
}
