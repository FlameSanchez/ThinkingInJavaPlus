package containers.myTest;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

/*
You’ll see that there are really only four basic container components—Map, List, Set, and Queue—
    and only two or three implementations of each one (the java.util.concurrent implementations of Queue are not included in this diagram).
    The containers that you will use most often have heavy black lines around them.
The dotted boxes represent interfaces, and the solid boxes are regular (concrete) classes.
The dotted lines with hollow arrows indicate that a particular class is implementing an interface.
The solid arrows show that a class can produce objects of the class the arrow is pointing to.
For example, any Collection can produce an Iterator, and a List can produce a ListIterator (as well as an ordinary Iterator,
since List is inherited from Collection).
 */
public class Taxonomy {


    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        //Collection to Iterator
        Collection<Object> list1 = new ArrayList<>();
        Iterator<Object> iterator = list1.iterator();

        //List to  ListIterator
        ListIterator<Object> objectListIterator = list.listIterator();
        //Map to Collection
        Map<Object, Object> map= new HashMap<>();
        Collection<Object> values = map.values();


    }
}
