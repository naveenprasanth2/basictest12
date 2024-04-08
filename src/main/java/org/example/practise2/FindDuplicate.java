package org.example.practise2;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> test = List.of(4, 1, 2, 1, 2);
        test.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1)
                .forEach(x -> System.out.println(x.getKey()));
    }
}
