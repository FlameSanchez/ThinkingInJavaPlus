package typeinfo.myTest;

import com.sun.org.apache.bcel.internal.generic.NEW;

class AA {}
class BB extends AA{}

public class InstanceOfTest {


    public static void main(String[] args) {

        AA aa = new AA();
        BB bb = new BB();

        System.out.println(aa instanceof BB);
        System.out.println(bb instanceof AA);

        System.out.println(AA.class.isInstance(bb));
        System.out.println(BB.class.isInstance(aa));
    }
}
