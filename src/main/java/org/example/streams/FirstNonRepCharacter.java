package org.example.streams;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepCharacter {
    public static void main(String[] args) {
        String value = "stress";
        Map<String, Long> test = Stream.of(value.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Stream.of(value.split("")).filter(x -> test.get(x) == 1)
                .findFirst().ifPresentOrElse(System.out::println, () -> {
                    throw new NoSuchElementException("no such element found");
                });
    }
}
