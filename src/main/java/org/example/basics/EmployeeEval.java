package org.example.basics;

import java.util.List;

public class EmployeeEval {
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

        employees.stream().filter(x -> x.getDevices().contains("galaxy")).map(Employee::getName).findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("No employee found"));
    }
}
