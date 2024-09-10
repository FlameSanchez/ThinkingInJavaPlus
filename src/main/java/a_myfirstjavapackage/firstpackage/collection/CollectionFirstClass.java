package a_myfirstjavapackage.firstpackage.collection;


import a_myfirstjavapackage.firstpackage.basics.FirstClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/*   List集合：         添加的元素是有序,可重复,有索引
     Set集合：          添加的元素是无序,不重复、无索引
     Hashmap集合：      添加的键是无序,不重复、无索引
     LinkedHashMap集合：添加的键是有序,不重复、无索引
     TreeMap集合：      添加的键可排序,不重复、无索引
     */
public class CollectionFirstClass {

    public static void main(String[] args) {
    Collection<String> list = new ArrayList<>(Arrays.asList("a","b","c"));

/*
public boolean add(Ee)
public void clear()
public boolean remove(Ee)
public boolean contains(Object obj)
public boolean isEmpty()
public int size()*/

//        底层equals()
//        public boolean contains(Object obj){}

//-----------------------------------------------------------------------
//        遍历方式
//         1.iterator remove()删除
/*
1,报错NoSuchElementException
2,迭代器遍历完毕，指针不会复位
3,循环中只能用一次next方法
4,迭代器遍历时，不能用集合的方法进行增加或者删除
*/

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//              2. 增强for遍历
//● 增强fo的底层就是迭代器，为了简化迭代器的代码书写的。
//● 它是DK5之后出现的，其内部原理就是一个Iterator迭代器
//● 所有的单列集合和数组才能用增强for进行遍历。
        for (String s : list) {
            System.out.println(s);
        }


//                3.lambda
        list.forEach(s->{
            System.out.println(s);
        });

//               4.listIterator
    }

}
