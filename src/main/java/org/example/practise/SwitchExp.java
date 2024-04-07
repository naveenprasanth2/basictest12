package org.example.practise;

import java.util.List;

public class SwitchExp {
    public static void main() {
        List<Object> items = List.of("Hello", 42, new Person("John Doe"), 3.14);
        items.forEach(x -> {
            switch (x) {
                case String s -> System.out.println(STR."\{s} is a string");
                case Person p -> System.out.println(p);
                case Integer i -> System.out.println(i);
                default -> System.out.println("none matched");
            }
        });
    }
}
