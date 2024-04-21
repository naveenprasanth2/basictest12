package org.example.practise3;

import java.util.Arrays;

public class PrintNumbersWithoutLoop {
    public static void main(String[] args) {
        Object[] values = new Object[100];
        Arrays.fill(values, new Object() {
            int count = 0;

            @Override
            public String toString() {
                count++;
                return String.valueOf(count);
            }
        });
        System.out.println(Arrays.toString(values));
    }
}
