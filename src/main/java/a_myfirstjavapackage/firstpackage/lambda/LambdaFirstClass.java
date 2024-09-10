package a_myfirstjavapackage.firstpackage.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
Lambda:表达式可以用来简化匿名内部类的书写
Lambda表达式只能简化函数式接口的匿名内部类的写法
函数式接口：有且仅有一个抽象方法的接口叫做函数式接口，接口上方可以加@FunctionalInterface注解
·参数类型可以省略不写。
·如果只有一个参数，参数类型可以省略，同时()也可以省略。
·如果Lambda表达式的方法体只有一行，大括号，分号，return可以省略不写，需要同时省略。
*/
//如果以后我们要把数组中的数据按照指定的方式进行排列，就需要用到sort方法，而且要指定排序的规则
public class LambdaFirstClass {

    public static void main(String[] args) {
        Integer[] a = {23, 4, 3, 4, 6, 1, 4, 43, 546, 2, 8};

//        Arrays.sort(a, (Integer o1, Integer o2)-> {
//                return o2-o1;});
        Arrays.sort(a, (o1, o2)-> o2-o1);

        System.out.println(Arrays.toString(a));

    }

}
