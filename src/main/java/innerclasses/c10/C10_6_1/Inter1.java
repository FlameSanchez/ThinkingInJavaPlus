package innerclasses.c10.C10_6_1;

import innerclasses.c10.C10_6.Inter;

public class Inter1 {

    protected  class Inner implements Inter {
        // !!! Force constructor to be public:
        public Inner() {
        }

        @Override
        public void test() {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {

    }
}
