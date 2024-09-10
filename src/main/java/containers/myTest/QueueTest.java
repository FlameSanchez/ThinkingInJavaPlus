package containers.myTest;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//QueueTest
public class QueueTest {


    public static void main(String[] args) {


        Queue<Object> queue= new LinkedList<>();
        Queue<Object> queue1= new PriorityQueue<>();

        queue.offer("1");
        queue.add("2");
        queue.offer("4");
        queue.add("3");

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
    }



}
