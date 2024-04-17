package org.example.practise1;

import org.example.basics.Employee;

import java.util.List;

public class ComparatorEval {
    public static void main(String[] args) {
        Employee e1 = Employee.builder()
                .age(20)
                .name("naveen")
                .devices(List.of("apple", "apple1", "Android", "samsung", "samsung1"))
                .gender("male")
                .build();

        Employee e2 = Employee.builder()
                .age(21)
                .name("prasanth")
                .devices(List.of("samsung", "lg", "galaxy", "galaxy22", "galaxy24"))
                .gender("male")
                .build();

        List<Employee> employees = List.of(e1, e2);

        List<Employee> sortedList = employees.stream().sorted(ComparatorExample.comparator1).toList();

        System.out.println(sortedList);
    }
}
