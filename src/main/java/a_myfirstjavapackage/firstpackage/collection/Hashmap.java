package a_myfirstjavapackage.firstpackage.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
1,HashMap.底层是哈希表结构的
2.依赖hashCode方法和equals方法保证键的唯一
3.如果键存储的是自定义对象，需要重写hashCode和equals方法
如果值存储自定义对象，不需要重写hashCode和equals方法*/
public class Hashmap {

    public static void main(String[] args) {

        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put(1, 2);
        System.out.println(hashMap.put(1, 3));
        System.out.println(hashMap.put(1, 4));
        System.out.println(hashMap.containsValue(3));
        System.out.println(hashMap.containsValue(4));
        hashMap.put(2, 5);
        hashMap.put(3, 5);

        hashMap.forEach((key,value)->{System.out.println(key + "=" + value);});

        Set<Map.Entry<Object, Object>> entries = hashMap.entrySet();
//        for (Map.Entry<Object, Object> entry : entries) {
//            System.out.println(entry.getKey() + "\t" + entry.getValue());
//        }

//        entries.forEach(entry->System.out.println(entry.getKey() + "\t" + entry.getValue()));

    }
}
