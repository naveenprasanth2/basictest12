package org.example.streams;

import java.util.ArrayList;
import java.util.List;

public class RotateTheArray {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        int k = 2;
        while (k > 0) {
            test.addFirst(test.removeLast());
            k--;
        }
        System.out.println(test);
    }
}
