package a_myfirstjavapackage.firstpackage.collection;

import java.util.ArrayList;
import java.util.Objects;

public class Arraylist {
    //        array/tree/linkedhash+list/set/map

    /*arraylist "数组"列表
    数组
    查询速度快：查询数据通过地址值和索引定位，查询任意数据耗时相同。（元素在内存中是连续存储的）
    删除效率低：要将原始数据删除，同时后面每个数据前移。*/
    public static void main(String[] args) {
        ArrayList<Fruits> f = new ArrayList<>();
        f.add(new Fruits("orange", 3.3f,1.5f));
        f.add(new Fruits("apple", 8.2f,2.0f));
        f.add(new Fruits("banana", 4.5f,2.5f));
//f.forEach(name,price,weight)->{};

//        f.stream().

        f.stream().forEach(s-> System.out.println(s));
    }
    static class Fruits {
        private String name;
        private float price;
        private float weight;

        public Fruits() {
        }

        public Fruits(String name, float price, float weight) {
            this.name = name;
            this.price = price;
            this.weight = weight;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Fruits fruits = (Fruits) o;
            return Float.compare(price, fruits.price) == 0 && Float.compare(weight, fruits.weight) == 0 && Objects.equals(name, fruits.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, price, weight);
        }

        @Override
        public String toString() {
            return "Fruits{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", weight=" + weight +
                    '}';
        }
    }
}
