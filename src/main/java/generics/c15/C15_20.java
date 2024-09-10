package generics.c15;


public interface  C15_20 {
    void test1();
    void test2();

}

class Test implements C15_20  {

    @Override
    public void test1() {
      System.out.println("3");
    }

    @Override
    public void test2() {
        System.out.println("2");
    }

    public void test3()  {
        System.out.println("1");
        System.out.println("1");
    }


}

class Test01 {

   static  <T extends C15_20> void test01(T t) {
        t.test1();
        t.test2();
    }

    public static void main(String[] args) {
        test01(new Test());

    }
}