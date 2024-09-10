package annotations.test;

import holding.c11.collection.list.shuffle.Student3;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class JDK8 {

    //Optional
    Integer getScore (Student3 student3) {
        return Optional.ofNullable(student3)
                .map(Student3::toString)
                .map(String::hashCode)
                .orElse(null);
    }


    public static void main(String[] args) {

//Consumer
        Consumer c = System.out::print;
        Consumer c1 = System.out::println;
        c.accept("hello world");
        c.accept("hello eastwood");
        c1.accept(123);
        c1.andThen(c1).andThen(c1).accept("666");


//Function
        Function<Integer, Integer> f1 = i -> i + i;
        Function<Integer, Integer> f2 = i -> i * i;
        Consumer c2 = System.out::print;
        c2.accept(f1.andThen(f2).apply(2));

    }
}
