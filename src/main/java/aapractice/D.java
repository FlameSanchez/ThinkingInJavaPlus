package aapractice;

public class D {
   private static int i=0;
   private int j=i++;
   private final int z;
  private static final int z1=1;
   final E e;

    public D(int z,E e) {
        this.z = z;

        this.e = e;
    }
    int  f(final int ss){return ss + 1;}
//    void  f1(final int ss){ ss++;}



    public static void main(String[] args) {
       D d= new D(1,new E());
////        System.out.println(d);

    }
}
class E{

}
