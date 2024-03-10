package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentEval {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", "A"),
                new Student("Bob", "B"),
                new Student("Charlie", "A"),
                new Student("David", "C"),
                new Student("Eve", "B"),
                new Student("Frank", "A")
        );

        List<Map.Entry<String, Long>> result = students.stream().collect(Collectors.groupingBy(Student::grade, Collectors.counting()))
                .entrySet().stream().toList();

        System.out.println(result);
    }
}
