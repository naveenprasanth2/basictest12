package org.example.practise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingAnyMissingNum {
    public static void main(String[] args) {
        int[] testArray = {0, 3, 6, 12}; // 3 is missing
        List<Integer> diffList = new ArrayList<>();
        for (int i = 1; i < testArray.length; i++) {
            diffList.add(testArray[i - 1] - testArray[i]);
        }
        System.out.println(diffList);
//        Integer distinct = diffList.stream().distinct().findFirst().orElseThrow();
        System.out.println(diffList.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())));
        int distinct = diffList.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1)
                .findFirst().orElseThrow().getKey();
        int missingNum = diffList.indexOf(distinct);
        System.out.println(testArray[missingNum - 1] - distinct);
    }
}
