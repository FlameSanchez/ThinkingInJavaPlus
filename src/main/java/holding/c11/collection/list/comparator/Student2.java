package holding.c11.collection.list.comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student2   implements Comparable<Student2>{

    private int id;
    private int age;
    private String name ;
    private int height;
    private int weight;

   public static void tt() {
        System.out.println("1");
    }
    @Override
    public int compareTo(Student2 o) {
//        if (o1.age == o2.age){
//            reture o1.id 小于 o2.id;
//        }else{
//            reture o1.age 小于 o2.age;
//        }
        return this.age-o.age;
    }

    public Student2(int id, int age, String name, int height, int weight) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {

        List<Student2> list = new ArrayList<>();
        list.add(new Student2(1, 11, "Tom",170,62));
        list.add(new Student2(2, 21, "Belly",161,61));
        list.add(new Student2(3, 13, "Maria",173,55));
        list.add(new Student2(4, 18, "Michael",159,46));
        list.add(new Student2(5, 13, "Jerry",180,70));

        System.out.println("排序前");
        for (Student2 student : list) {
            System.out.println(student);
        }
        System.out.println("年龄排序后");
        Collections.sort(list);
        for (Student2 student : list) {
            System.out.println(student);
        }

        //comparator
        Collections.sort(list, new Comparator<Student2>(
        ) {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return o1.height-o2.height;
            }
        });
        System.out.println("身高排序后");
        for (Student2 student : list) {
            System.out.println(student);
        }

        //comparator
        Collections.sort(list, new Comparator<Student2>(
        ) {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return o1.weight-o2.weight;
            }
        });
        System.out.println("体重排序后");
        for (Student2 student : list) {
            System.out.println(student);
        }



    }


}


