package org.example.practise1;

import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        int[] testArray = {0, 1, 2, 4, 5}; // 3 is missing

        List<Integer> integerList = Arrays.stream(testArray).boxed().toList();

        int arraySum = integerList.stream().mapToInt(Integer::intValue).sum();

        int value = ((integerList.size()) * (integerList.size() + 1)) / 2;

        System.out.println(value - arraySum);

    }
}
