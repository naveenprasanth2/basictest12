package org.example.basics;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NoOfOccurrences {
    public static void main() {
        String[] a = {"cat", "mat", "bat", "cat", "mat", "mat", "cat", "mat", "bat", "cat", "cat", "bat", "bat", "bat"};

        List<Map.Entry<String, Long>> entryList = Stream.of(a).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted((x1, x2) -> {
                    if(!Objects.equals(x1.getValue(), x2.getValue())){
                        return ((int) (x2.getValue() - x1.getValue()));
                    }
                    else {
                        return x1.getKey().compareTo(x2.getKey());
                    }
                }).toList();

        System.out.println(entryList);
    }
}
