package org.example.practise2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateUsingSet {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>(List.of(4, 1, 2, 1, 2));
        Set<Integer> hashSet = new HashSet<>();
        List<Integer> finalList = new ArrayList<>();
        for (int val: test){
            if(!hashSet.add(val)){
                finalList.add(val);
            }
        }
        test.removeAll(finalList);
        System.out.println(test);
    }
}
