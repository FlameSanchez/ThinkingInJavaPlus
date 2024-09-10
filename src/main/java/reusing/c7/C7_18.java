package reusing.c7;

import static net.mindview.util.Print.print;

public class C7_18 {


//    private String id;
//    public C(String id) { this.id = id; }
//    public String toString() {
//        return id  ;
//    }
//    public static void main(String[] args) {
//        C fd1 = new C("fd1");
//        print(fd1);
//        print("Creating new FinalData");
//        C fd2 = new C("fd2");
//        print(fd1);
//        print(fd2);
//    }

    private static  int count   ;

    private int id = count++;
    public String toString() { return "SelfCounter " + id; }

    public static void main(String[] args) {
        System.out.println("First object:");
        System.out.println(new WithFinalFields());
        System.out.println("Second object:");
        System.out.println(new WithFinalFields());
    }
}
class WithFinalFields {
    final C7_18 scf = new C7_18();
    static final C7_18 scsf = new C7_18();
    public String toString() {
        return "scf = " + scf + "\nscsf = " + scsf;
    }
}