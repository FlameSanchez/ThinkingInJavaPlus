package interfaces.c9;

 interface C9_12 {
     String name = null;
     inter2 INTER_2 = null;
     void hello();
     void hello1();
 }
interface inter {
    void hello2();
    void hello3();
}
class inter2 {
    public void hello() {

    }
class inter3 {
    public void hello() {

    }
    abstract class inter4 {
    public void hello() {

    }

}
class interf extends inter4 implements C9_12,inter{
    @Override
    public void hello2() {

    }

    public void hello3(){
        System.out.println("1");
    }



    @Override
    public void hello1() {

    }
}}}
