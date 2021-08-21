package mathAndStringSolutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayThroughCollection {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
