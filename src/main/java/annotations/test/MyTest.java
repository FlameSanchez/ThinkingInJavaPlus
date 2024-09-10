package annotations.test;


public class MyTest {


    @AnnotationFieldTest("s")
    int x;

    @AnnotationMethodTest()
    void test() {
        System.out.println("1");
    }



}
