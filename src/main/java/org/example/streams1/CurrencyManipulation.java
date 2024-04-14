package org.example.streams1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CurrencyManipulation {
    public static void main(String[] args) {
        List<Transaction> test = List.of(new Transaction("USD", 200.00),
                new Transaction("EUR", 150.00),
                new Transaction("USD", 100.00));

        List<Map.Entry<String, Double>> finalList = test.stream()
                .collect(Collectors.groupingBy(Transaction::currency, Collectors.summingDouble(Transaction::amount)))
                .entrySet().stream().toList();

        System.out.println(finalList);
    }
}
