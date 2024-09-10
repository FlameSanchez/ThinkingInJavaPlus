package innerclasses.c10;

public class Outer1 {
    private String name;

    public Outer1(String name) {
        this.name = name;
    }

    class Inner{
        @Override
        public String toString() {
            return "Inner{}"+name;
        }
    }

    Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {

        Outer1 outer1 = new Outer1("hha");
        Inner inner = outer1.getInner();

        System.out.println(inner);
    }
}
