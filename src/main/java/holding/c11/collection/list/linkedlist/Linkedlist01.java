package holding.c11.collection.list.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class Linkedlist01 {


    public static void main(String[] args) {
        LinkedList<Integer> link= new LinkedList<>(Arrays.asList(1,2,3,4,1,9,7));
        System.out.println(link.getFirst()+"\t"+link.element()+"\t"+link.peek());
//        link.clear();
//        System.out.println(link.getFirst()+"\t"+link.element());
//        System.out.println(link.peek());
        System.out.println(link.remove()+"\t"+link.removeFirst()+"\t"+link.poll());
//        link.clear();
//        System.out.println(link.remove()+"\t"+link.removeFirst());
//        System.out.println(link.poll());

        link.add(12);
        link.addFirst(13);
        link.addLast(14);
        link.offer(15);
        System.out.println(link);

        System.out.println(link.removeFirst());
        System.out.println(link.remove());
        System.out.println(link.removeLast());
        System.out.println(link.poll());
        System.out.println(link);


    }
}
