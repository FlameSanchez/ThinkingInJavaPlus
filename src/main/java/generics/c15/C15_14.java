package generics.c15;

import generics.CountedObject;
import net.mindview.util.BasicGenerator;
import net.mindview.util.Generator;

public class C15_14 {

        public static void main(String[] args) {
            Generator<CountedObject> gen =
                    new BasicGenerator(CountedObject.class);
            for(int i = 0; i < 5; i++)
                System.out.println(gen.next());

    }
}
