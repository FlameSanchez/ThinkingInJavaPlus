package containers.myTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FillContainers {

    public static void main(String[] args) {
        Collections.fill(new ArrayList<>(), 1);
        List<Integer> list = Collections.nCopies(3, new Integer(2));
    }
}
