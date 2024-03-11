package org.example.streams;

import java.util.StringJoiner;

public class CheckPalindrome {
    public static void main(String[] args) {
        String value = "madam";
//        System.out.println(new StringBuilder(value).reverse().toString().equals(value));
        StringJoiner stringJoiner = new StringJoiner("", "", "");
        for (int i = value.length() - 1; i >= 0; i--) {
            stringJoiner.add(String.valueOf(value.charAt(i)));
        }
        System.out.println(stringJoiner.toString().equals(value));
    }
}
