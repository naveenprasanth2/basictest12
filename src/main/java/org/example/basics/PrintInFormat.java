package org.example.basics;

import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintInFormat {
    public static void main(String[] args) {
        String a = "abcabc";
        List<Map.Entry<String, Long>> test = Stream.of(a.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().toList();
        StringJoiner stringJoiner = new StringJoiner(",", "<", ">");
        test.forEach(x -> stringJoiner.add(STR."(\{x.getKey()},\{x.getValue()})"));
        System.out.println(stringJoiner);
    }
}
