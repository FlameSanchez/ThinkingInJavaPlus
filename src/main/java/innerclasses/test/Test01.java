package innerclasses.test;

interface s {

}
public class Test01 implements s{

    static class Test02 {
    int i;

//        public Test02(int i) {
//            this.i = i;
//        }
    }

    public static void main(String[] args) {

//        Test02 test02 = new Test01().new Test02(2);
        new Test01.Test02();
       s s1= new Test01();

        Test02 test02 = new Test02();
    }
}
