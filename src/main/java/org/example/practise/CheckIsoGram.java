package org.example.practise;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckIsoGram {
    public static void main(String[] args) {
        String value = "shiva";

//        Map<String, Long> test = Stream.of(value.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//        test.entrySet().stream().filter(x -> x.getValue() > 1).findFirst()
//                .ifPresentOrElse(x -> System.out.println("its not an isogram"), () -> System.out.println("Its an isogram"));

      List<Map.Entry<String, Long>> test = Stream.of(value.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream().filter(x -> x.getValue()>1).toList();

        System.out.println(test.stream().anyMatch(x -> x.getValue() > 1));
    }
}
