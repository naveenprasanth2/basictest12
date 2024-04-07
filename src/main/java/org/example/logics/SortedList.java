package org.example.logics;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SortedList {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>(List.of(8, 3, 5, 12, 2, 7, 10));
        List<Integer> secondList = List.of(32, 3, 1, 4, 5, 6, 0);
        firstList.addAll(secondList);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(firstList);

        List<Integer> finalList = new ArrayList<>();
        while (!priorityQueue.isEmpty()) {
            finalList.add(priorityQueue.poll());
        }

        System.out.println(finalList);
    }
}
