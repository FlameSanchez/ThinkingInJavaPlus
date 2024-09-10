package containers.c17;

import net.mindview.util.CollectionData;
import net.mindview.util.RandomGenerator;

import java.util.Random;
import java.util.TreeSet;

public class C17_9 {

    public static void main(String[] args) {
        TreeSet<String> ts =
                new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        ts.addAll(CollectionData.list(
                new RandomGenerator.String(), 10));
        System.out.println("ts = " + ts);

        }
    }
