package a_myfirstjavapackage.firstpackage.collection;

/*hashcode()
哈希值
●根据hashCode方法算出来的int类型的整数
●该方法定义在Object类中，所有对象都可以调用，默认使用地址值进行计算
●一般情况下，会重写hashCode方法，利用对象内部的属性值计算哈希值

对象的哈希值特点
●如果没有重写hashCode方法，不同对象计算出的哈希值是不同的
●如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
●在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。(哈希碰撞)*/



import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Hashset {
/*Hashset 无序 不重复
HashSet底层原理
HashSets集合底层采取哈希表存储数据
哈希表是一种对于增删改查数据性能都较好的结构

哈希表组成
JDK8之前：数组+链表
JDK8开始：数组+链表+红黑树

int index=(数组长度-1)&哈希值；
如果集合中存储的是自定义对象，必须要重写hashCode和equals方法(系统自动帮你重写后比的是属性值而不是地址值)*/

 //LinkedHashSet 有序 不重复
//    原理：底层数据结构是依然哈希表，只是每个元素又额外的多了一个双链表的机制记录存储的顺序。

/*TreeSet 可排序 不重复
  可排序：按照元素的默认规则（有小到大）排序。
  TreeSet集合底层是基于红黑树的数据结构实现排序的，增删改查性能都较好。
  对于数值类型：Integer,Double,默认按照从小到大的顺序进行排序。
  对于字符、字符串类型：按照字符在]ASCII码表中的数字升序进行排序。a=97

  TreeSet的两种比较方式
方式一：默认排序/自然排序：Javabean类实现Comparable接口指定比较规则
方式二：比较器排序：创建TreeSet对象时候，传递比较器Comparator指定规则
使用原则：默认使用第一种，如果第一种不能满足当前需求，就使用第二种
*/
}
