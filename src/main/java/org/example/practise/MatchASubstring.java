package org.example.practise;

import java.util.regex.Pattern;

public class MatchASubstring {
    public static void main(String[] args) {
        String name = "The catalog was extensive.";
        String sub = "cat";
        //Pattern.quote(string) will help in avoiding any special characters meaning
        System.out.println(Pattern.matches(".*"+Pattern.quote(sub)+".*", name));

    }
}
