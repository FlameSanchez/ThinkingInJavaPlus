package containers;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import containers.Test;
import containers.TestParam;
import containers.Tester;
import containers.myTest.TreeSeries;
import net.mindview.util.*;

import java.util.*;
//  tester<c> c is the tool in the AnnonymousInnerClass
public class C17_30 {
    static Random rand = new Random();
    static int reps = 1000;
    static List<Test<List<Integer>>> tests =
            new ArrayList<Test<List<Integer>>>();
static {
    tests.add(new Test<List<Integer>>("sort") {
        @Override
        int test(List<Integer> list, TestParam tp) {
            int loops = tp.loops;
            for (int j = 0; j< loops; j++) {
            list.clear();
            List<Integer> integers = new CollectionData<>(new RandomGenerator.Integer(), tp.size);
            list.addAll(integers);
            Collections.sort(list);
            }

            return loops;
        }
    });

}
        static class Collect extends Tester<List<Integer>>{


        public Collect(List<Integer> container, List<Test<List<Integer>>> tests) {
            super(container, tests);
        }

        @Override
        protected List<Integer> initialize(int size) {
            return container;
        }
    }
    public static void main(String[] args) {

    new Collect(new ArrayList<>(),tests).timedTest();
    new Collect(new LinkedList<>(),tests).timedTest();



    }
}
