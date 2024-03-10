package org.example.practise;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class AverageOfAnArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 255, 777};

        double average =  Arrays.stream(a).boxed()
                .mapToInt(Integer::intValue)
                .average()
                .orElseThrow(NoSuchElementException::new);

        System.out.println(average);
    }
}
