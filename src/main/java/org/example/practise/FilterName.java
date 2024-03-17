package org.example.practise;

import java.util.List;

public class FilterName {
    public static void main(String[] args) {
        List<String> names = List.of("James", "John", "Sarah", "Jessica", "Michael");
        names.stream().filter(x -> x.matches("^J[a-zA-Z]+")).forEach(System.out::println);
    }
}
