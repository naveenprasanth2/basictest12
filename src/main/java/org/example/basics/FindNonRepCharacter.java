package org.example.basics;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class FindNonRepCharacter {
    public static void main(String[] args) {
        String a = "is it your first company";
       List<String> test =  Stream.of(a.replaceAll("\\s", "").split("")).toList();
                test.stream().filter(x -> Collections.frequency(test, x) == 1)
                        .findFirst().ifPresentOrElse(System.out::println, ()-> System.out.println("not present"));
                
    }
}
