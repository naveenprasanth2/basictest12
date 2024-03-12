package org.example.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BalancedString {
    public static void main(String[] args) {
        String sample = "([{}])";
        HashMap<String, String> testMap = new HashMap<>();
        testMap.put("{", "}");
        testMap.put("(", ")");
        testMap.put("[", "]");
        Supplier<Stream<String>> test = () -> Stream.of(sample.split(""));
        Map<String, Long> resultMap = test.get()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        long resultCount = testMap.entrySet().stream()
                .filter(x -> {
                    if(testMap.containsKey(x.getKey()) && testMap.containsKey(x.getValue())){
                       return resultMap.get(x.getKey()).equals(resultMap.get(x.getValue()));
                    }
                    return false;
                }).count();

        if (testMap.size() == resultCount){
            System.out.println("String is balanced");
        }else {
            System.out.println("String is not balanced");
        }
    }
}
