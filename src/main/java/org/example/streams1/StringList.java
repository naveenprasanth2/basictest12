package org.example.streams1;

import java.util.List;

public class StringList {
    private static final List<String> list;

    static {
        list = List.of("apple", "banana", "cherry");
    }

    public static void main(String[] args) {
        System.out.println(getElementFromList(0));
        System.out.println(getElementFromList(2));
    }

    private static String getElementFromList(int index) {
       return list.stream().skip(index).findFirst().map(String::toUpperCase).orElse("DEFAULT");
    }
}
