package holding.c11.collection.list.shuffle;
import java.util.*;

// 1）static void shuffle(list<?> list)  使用默认随机源对列表进行置换，所有置换发生的可能性都是大致相等的。
//
// 2）static void shuffle(list<?> list, Random rand) 使用指定的随机源对指定列表进行置换，所有置换发生的可能性都是大致相等的，假定随机源是公平的。

//  如果给定一个整型数组，用Arrays.asList()方法将其转化为一个集合类，有两种途径：
//
//        1）用List<Integer> list=ArrayList(Arrays.asList(ia)),用shuffle()打乱不会改变底层数组的顺序。
//
//        2）用List<Integer> list=Arrays.aslist(ia),然后用shuffle()打乱会改变底层数组的顺序。代码例子如下：
//
public class Student3 {

    private int id;
    private int age;
    private String name ;
    private int height;
    private int weight;

    public Student3(int id, int age, String name, int height, int weight) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Random rand = new Random(47);

        Student3 s1 = new Student3(1, 11, "Tom", 170, 62);
        Student3 s2 = new Student3(2, 21, "Belly",161,61);
        Student3 s3 = new Student3(3, 13, "Maria",173,55);
        Student3 s4 = new Student3(4, 18, "Michael",159,46);
        Student3 s5 = new Student3(5, 13, "Jerry",180,70);
        Student3[] student3s = {s1,s2,s3,s4,s5};
        List list=new ArrayList(Arrays.asList(student3s));
        System.out.println("乱序前");
        for (Object o : list) {
            System.out.println(o);
        }
        Collections.shuffle(list, rand);
        System.out.println("乱序后");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.print(Arrays.toString(student3s));

        List list1=Arrays.asList(student3s);
        System.out.println("乱序前");
        for (Object o : list1) {
            System.out.println(o);
        }
        Collections.shuffle(list1, rand);
        System.out.println("乱序后");
        for (Object o : list1) {
            System.out.println(o);
        }
        System.out.print(Arrays.toString(student3s));


    }
}
