package mathAndStringSolutions;

import java.util.Arrays;

public class ReverseArrayThroughFor {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int size = array.length;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
