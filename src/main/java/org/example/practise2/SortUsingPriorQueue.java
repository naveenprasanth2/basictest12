package org.example.practise2;

import java.util.List;
import java.util.PriorityQueue;

public class SortUsingPriorQueue {
    public static void main(String[] args) {
        List<Integer> test = List.of(1, 3, 4, 2, 3, 2, 1, 8, 9, 6, 54, 3);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(test);
        while (!priorityQueue.isEmpty()){
            System.out.print(STR."\{priorityQueue.poll()},");
        }
    }

}
