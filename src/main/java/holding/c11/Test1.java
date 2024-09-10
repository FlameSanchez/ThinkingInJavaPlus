package holding.c11;

import java.util.Iterator;

public class Test1   {


    Iterator tt(){

        return new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };

    }

    public static void main(String[] args) {





    }


}
