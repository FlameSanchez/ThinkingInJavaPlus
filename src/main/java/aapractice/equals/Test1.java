package aapractice.equals;

class  Student{

    String names;
    int age;

    public Student() {
    }

    public Student(String names, int age) {
        this.names = names;
        this.age = age;
    }
}
public class Test1 implements  Test {
    @Override
    public int print() {
        return 0;
    }
    public void print1() {
        System.out.println("1");;
    }

    public static void main(String[] args) {

        String name1 = new String("1");
        String name2 = new String("2");
        System.out.println(name1+"\t"+name2);
        System.out.println(name1.equals(name2));

        Student wen = new Student("wen", 1);
        Student wen1 = new Student("wen", 1);
        System.out.println(wen+"\t"+wen1);
        System.out.println(wen.equals(wen1));

    }

}
