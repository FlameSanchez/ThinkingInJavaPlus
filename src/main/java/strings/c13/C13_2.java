package strings.c13;

import strings.InfiniteRecursion;

import java.util.ArrayList;
import java.util.List;

public class C13_2 {

    public String toString() {
        return " InfiniteRecursion address: " + super.toString()+ "\n";
    }
    public static void main(String[] args) {
        List<InfiniteRecursion> v =
                new ArrayList<InfiniteRecursion>();
        for(int i = 0; i < 10; i++)
            v.add(new InfiniteRecursion());
        System.out.println(v);
}


}
