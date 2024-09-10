package containers.myTest;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

class Test extends AbstractMap {

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
public class MapEntryTest implements Map.Entry {


    @Override
    public Object getKey() {
        return null;
    }

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public Object setValue(Object value) {
        return null;
    }

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
    }
}
