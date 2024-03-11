package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6, 8};

        List<Integer> test = Stream.of(a, b).flatMapToInt(Arrays::stream).boxed().sorted().toList();
        System.out.println(test);
    }
}
