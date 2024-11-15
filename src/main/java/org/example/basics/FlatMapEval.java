package org.example.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapEval {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {7, 8, 9, 0, 1};

        List<Integer> test = Stream.of(a, b).flatMapToInt(Arrays::stream).boxed().toList();
        System.out.println(test);
    }
}
