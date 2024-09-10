package holding.c11.c11_28;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Random random = new Random(47);

        PriorityQueue<Double> doubles = new PriorityQueue<>();
        for (int i = 0; i <10 ; i++) {
            Double x = Double.valueOf(random.nextInt(i + 10));
            doubles.offer(x);
        }
        for (int i = 0; i <10 ; i++) {
                System.out.println(doubles.poll());
    }
}}
