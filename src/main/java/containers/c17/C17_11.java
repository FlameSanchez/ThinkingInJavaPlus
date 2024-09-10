package containers.c17;

import java.util.PriorityQueue;
import java.util.Random;
//the concurrency-based Queues  PriorityQueue的几个Queue的方法牵扯到排序，而且每个都有独特的意思，有待深究！！！
//PriorityQueue存储自定义对象时，即便该对象实现了Comparable,queue也没有排序，需要用到Queue里面的方法
class Item implements Comparable<Item> {
    private static final Random rnd = new Random(47);
    private Integer priority = rnd.nextInt(101);

    public Item(Integer priority) {
        this.priority = priority;
    }

    public Item() {
    }

    public int compareTo(Item arg) {
        return priority < arg.priority ? -1 : priority == arg.priority ? 0 : 1;
    }
    public String toString() {
        return Integer.toString(priority);
    }
}
public class C17_11 {
    public static void main(String[] args) {
        PriorityQueue<Item> queue = new PriorityQueue<Item>();
        for(int i = 0; i < 10; i++)
            queue.add(new Item());

        Item item;
        while((item = queue.poll()) != null)
            System.out.println(item);

//        queue.offer(new Item(111));
//        System.out.println(queue);
//        queue.offer(new Item(112));
//        System.out.println(queue);

//        while((item = queue.remove()) != null)
//        System.out.println(item);

//          while((item = queue.peek()) != null)
//        System.out.println(item);

//        while((item = queue.element()) != null)
//        System.out.println(item);

    }
}