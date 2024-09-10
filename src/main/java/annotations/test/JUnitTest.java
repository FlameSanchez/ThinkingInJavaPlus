package annotations.test;

import net.mindview.atunit.Test;

public class JUnitTest {

//    @Test
//    int test1(int s) {
//        return s;
//    }

  static   void assertFailureExample() {
        assert 1 == 2: "What a surprise!";
    }
    static   void assertFailureExample1() {
        assert 1 == 2: 3;
    }

    public static void main(String[] args) {

        assertFailureExample();
    }
}
