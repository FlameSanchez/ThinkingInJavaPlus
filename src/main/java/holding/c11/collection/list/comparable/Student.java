package holding.c11.collection.list.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 这里说一下重写的 public int compareTo(Student o){} 这个方法，它返回三种 int 类型的值： 负整数，零 ，正整数。
 *
 */
public class Student implements Comparable<Student>{

    private Integer id;
    private int age;

    private String name ;

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }
    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(1, 11, "Tom"));
        list.add(new Student(2, 21, "Belly"));
        list.add(new Student(3, 13, "Maria"));
        list.add(new Student(4, 18, "Michael"));
        list.add(new Student(5, 13, "Jerry"));
        System.out.println("排序前");
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("排序后");
        Collections.sort(list);
        for (Student student : list) {
            System.out.println(student);
        }

    }

}
