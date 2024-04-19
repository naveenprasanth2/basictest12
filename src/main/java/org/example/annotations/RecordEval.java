package org.example.annotations;

public class RecordEval {
    public static void main() {
        Dog dog = Dog.builder().name("summa").build();
        System.out.println(dog.name());
    }
}
