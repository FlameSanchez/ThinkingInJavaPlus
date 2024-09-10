  package aapractice;

import static net.mindview.util.Print.print;

class  B1{
    public B1() {
        System.out.println("wordB");
    }
}
public class C56 {

//   static  String word;
//   static {
//       System.out.println("word");
//   }
//
//    public C56() {
//        System.out.println("wordC56");
//    }
//
//     B b = new B();
//    public static void main(String[] args) {
//        C56 a = new C56();
//       System.out.println(a.word );
//
//    }

//5.14
//    static  String word="word";
//    static  String word1;
//    static {
//        word1="word1";
//        System.out.println(word+"\t"+word1);
//    }
//    static void p(){
//        System.out.println(C56.word+""+C56.word1);
//    }
//
//    public static void main(String[] args) {
//        C56.p();
//    }


//      5 demo
//    {
//        System.out.println("initial");
//    }
//
//    public C56() {
//        System.out.println("wordC56");
//    }
//
//    public static void main(String[] args) {
//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        new C56();
//        System.out.println("4");
//        new C56();
//    }


//5.16
//    public static void main(String[] args) {
//        C.main(new String[]{"hello","world","!"});
//    }


//5.19
//    private void aa(){}
//    static    void test(String...word){
//        System.out.println("word");
//    }
//    public static void main(String[] args) {
//        test("hello","world","!");
//    }
    protected  String name="name";
    public   Integer num=2;
    public C56(int age) {
        System.out.println(age);
    }
//    public C56(Integer num) {
//        System.out.println("C562");
//    }
    private  final void s( ){
        System.out.println("1" );
    }

    public static void main(String[] args) {

        C56 a = new C56(10);
        System.out.println("1");
    }


}
class C1 extends  C56 {
    private  final  void s(){
        System.out.println("hello");
    }
    public C1(int age) {
        super(age);
    }

    public static void main(String[] args) {
        C1 c=new C1(1);
        C56 a = new C56(2);




//        for (int i = 0; i < args.length; i++) {
//            printnb(args[i]);
//        }
    }
}