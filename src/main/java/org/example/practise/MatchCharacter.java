package org.example.practise;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class MatchCharacter {
    public static void main(String[] args) {
        String testString = "Hello, world!";
        String vowelPattern = "[aeiou]";

        List<String> listVal = Stream.of(testString.split(" ")).filter(x -> Pattern.matches(".*"+vowelPattern+".*", x)).toList();

        System.out.println(listVal);
    }
}
