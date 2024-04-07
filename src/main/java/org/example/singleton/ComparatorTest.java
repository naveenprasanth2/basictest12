package org.example.singleton;

import org.example.practise.Person;

import java.util.Comparator;

public class ComparatorTest {
    Comparator<String> comparator = String::compareTo;
    Comparator<Person> personComparator = Comparator.comparing(Person::name);
}
