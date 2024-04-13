package org.example.generics;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckIsogram {
    public static void main(String[] args) {
        String name = "dialoguee";
        List<String> list = Stream.of(name.split("")).toList();
        list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1)
                .findFirst().
                ifPresentOrElse(_ -> System.out.println("Not an isogram"), () -> System.out.println("Its an isogram"));
    }
}
