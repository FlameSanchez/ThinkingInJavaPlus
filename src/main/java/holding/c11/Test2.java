package holding.c11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public  class Test2 implements Iterable{

int i;

    @Override
    public Iterator iterator() {
        return null;
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        for (Object o : test2) {

        }
        Map<Object, Object> map= new HashMap<>();


    }
}
