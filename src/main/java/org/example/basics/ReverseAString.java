package org.example.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ReverseAString {
    public static void main(String[] args) {
        String a = "Hello Good Morning";
        List<String> values = new ArrayList<>(Stream.of(a.split(" ")).toList());
        Collections.reverse(values);
        System.out.println(values);
    }
}
