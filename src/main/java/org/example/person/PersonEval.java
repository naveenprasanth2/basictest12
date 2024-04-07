package org.example.person;

import java.util.Comparator;
import java.util.List;

public class PersonEval {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob", 20);
        Person p3 = new Person("Carol", 35);
        Person p4 = new Person("David", 28);
        Person p5 = new Person("Eve", 40);
        List<Person> personList = List.of(p1, p2, p3, p4, p5);

        List<Person> filteredList = personList.stream().filter(person -> person.age() > 30).toList();

        List<String> nameList = personList.stream().map(Person::name).toList();

        List<Person> sortedList = personList.stream().sorted(Comparator.comparing(Person::name)).toList();

        double average = personList.stream().mapToInt(Person::age).average().orElseThrow();

        System.out.println(filteredList);
        System.out.println(nameList);
        System.out.println(sortedList);
        System.out.println(average);
    }
}
