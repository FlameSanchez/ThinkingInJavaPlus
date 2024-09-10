package containers.myTest;

import java.util.AbstractSet;
import java.util.Iterator;

public class CountriesTest1 extends AbstractSet  {
    Integer[] i = {1, 2, 3, 4, 5, 1, 1, 2, 3};
    int index =-1;

    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                if (index < i.length-1) {
                    return true;
                }
                return false;
            }

            @Override
            public Object next() {
                index++;
                return i[index];
            }
        };
    }

    @Override
    public int size() {
        return 0;
    }

    public static void main(String[] args) {


        for (Object o : new CountriesTest1()) {
            System.out.println(o);
        }
    }
}
