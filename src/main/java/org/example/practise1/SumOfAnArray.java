package org.example.practise1;

import java.util.List;

public class SumOfAnArray {
    public static void main(String[] args) {
        List<Integer> test = List.of(1, 2, 3, 4, 5);
        System.out.println(test.stream().mapToInt(Integer::intValue).sum());
    }
}
