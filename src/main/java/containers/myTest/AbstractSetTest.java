package containers.myTest;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
//              override:               tostring()
//AbstractSet   iterator(),size()
//AbstractMap   entryset()
//AbstractList  get(),size()
public class AbstractSetTest implements Map {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }


    public static void main(String[] args) {

        Integer[] i = new Integer[3];
        for (Integer integer : i) {
         }


    }
}
