package innerclasses.c10;

//: innerclasses/Sequence.java
// Holds a sequence of Objects.

interface Selector {
    boolean end();
    Object current();
    void next();
}

class Test{
    String name;

    @Override
    public String toString() {
        return "aapractice.equals.Test09{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Sequence {
    Test test;
    private Object[] items;
    private int next = 0;
    public Sequence(int size) { items = new Object[size]; }
    void test(){
        System.out.println("1");
    };
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
        void test2(){}
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence(11);
//        for(int i = 0; i < 11; i++)
//            sequence.add(Integer.toString(i));
//        Selector selector = sequence.selector();
//
        System.out.println(sequence.test);
        // watch
//!!        selector.next;
//        System.out.println(((SequenceSelector) selector).i);
//        ((SequenceSelector) selector).test2();

//        while(!selector.end()) {
//            System.out.print(selector.current() + " ");
//            selector.next();
//        }
    }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~

