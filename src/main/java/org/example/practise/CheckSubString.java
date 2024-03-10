package org.example.practise;

import java.util.regex.Pattern;

public class CheckSubString {
    public static void main(String[] args) {
        String a = "naveen is a good boy\"";
        String sub = "boy\"";

        System.out.println(Pattern.matches(".*"+Pattern.quote(sub)+".*", a));

    }
}
