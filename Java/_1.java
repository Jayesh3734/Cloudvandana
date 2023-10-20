// Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _1 {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
        List<Integer> newArray = Arrays.asList(intArray);
        Collections.shuffle(newArray);
        System.out.println("Shuffled Array: " + newArray);
    }
}