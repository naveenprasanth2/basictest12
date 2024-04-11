package org.example.basics;

import java.util.ArrayList;
import java.util.List;

public class ZerosToEnd {
    public static void main() {
        int[] a = {2, 3, 0, 0, 5, 0, 8, 2, 0, 0, 3};

        List<Integer> test = new ArrayList<>();

        int count = 0;

        for (int x : a) {
            if (x == 0) {
                test.add(test.size(), x);
                count++;
            } else {
                test.add(test.size() - count, x);
            }
        }
        System.out.println(test);
    }
}
