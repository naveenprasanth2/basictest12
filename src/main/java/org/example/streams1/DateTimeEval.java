package org.example.streams1;

import java.time.LocalDate;
import java.time.Period;

public class DateTimeEval {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.parse("2023-01-15");
        LocalDate endDate = LocalDate.parse("2024-04-25");
        System.out.println(findDifference(startDate, endDate));
    }

    private static String findDifference(LocalDate startDate, LocalDate endDate){
        Period diff = Period.between(startDate, endDate).normalized();
        return formatDuration(diff);
    }

    private static String formatDuration(Period period) {
        return STR."\{period.getYears()} years, \{period.getMonths()} months, \{period.getDays()} days";
    }
}
