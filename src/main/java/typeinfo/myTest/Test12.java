package typeinfo.myTest;
// interface name<T>
interface Test13<T> {
    T test();
}

class Test14 extends Test12 {

}
class Test15 {

}
public class Test12 implements Test13<Test15>{

    public static void main(String[] args) {

    }

    @Override
    public Test15 test() {
        return null;
    }
}
