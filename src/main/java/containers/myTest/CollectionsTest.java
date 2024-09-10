package containers.myTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static net.mindview.util.Print.print;

//collections
public class CollectionsTest {
int s;

    @Override
    public String toString() {
        return "CollectionsTest{" +
                "s=" + s +
                '}';
    }

    public CollectionsTest(int s) {
        this.s = s;
    }

    public static void main(String[] args) {

        List<String> list = Collections.singletonList("Four");
        List<Integer> list1 = Collections.singletonList(1);
        List<CollectionsTest> list2= Collections.singletonList(new CollectionsTest(3));
//        print(list);
//        list.add("zero");
//        list.set(0, "a")
//        print(list);
//        print(list1);
//        print(list2);


        List<CollectionsTest> collectionsTests = Collections.nCopies(5, new CollectionsTest(2));
        print(collectionsTests);

        List<String> list3 = Collections.nCopies(3, "asdf");
        print(list3);
    }
}
