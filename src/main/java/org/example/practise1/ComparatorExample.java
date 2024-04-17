package org.example.practise1;

import org.example.basics.Employee;

import java.util.Comparator;

public class ComparatorExample {
    public static Comparator<Employee> comparator = Comparator.comparing(Employee::getName);
    public static Comparator<Employee> comparator1 = Comparator.comparingInt(Employee::getAge).reversed();
}
