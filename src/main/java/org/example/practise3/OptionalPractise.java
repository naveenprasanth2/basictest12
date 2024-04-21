package org.example.practise3;

import java.util.Optional;

public class OptionalPractise {
    public static void main() {
        System.out.println(findCatByName("cat").orElse("summa"));
        System.out.println(findCatByName("catt").orElse("summa"));
        System.out.println(findCatByName("summa").orElseGet(Cat::new));
    }

    private static Optional<Object> findCatByName(String name) {
        if (name.equals("cat")) {
            return Optional.of("cat");
        } else {
            return Optional.empty();
        }
    }
}
