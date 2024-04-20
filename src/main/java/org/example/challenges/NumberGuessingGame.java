package org.example.challenges;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int tryCount = 0;
        boolean broke = false;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter the from range");
        int from = scanner1.nextInt();
        System.out.println("Please enter the to range");
        int to = scanner1.nextInt();
        int randomNumber = random.nextInt(from, to + 1);
        while (!broke) {
            System.out.println(STR."Please enter your guess between \{from} - \{to}:");
            Scanner scanner = new Scanner(System.in);
            int playerGuess = scanner.nextInt();
            tryCount++;
            if (playerGuess == randomNumber) {
                System.out.println("Its correct");
                System.out.println(STR."It took \{tryCount} tries for you to guess");
                broke = true;
            } else if (playerGuess > randomNumber) {
                System.out.println("Its a smaller number");
            } else {
                System.out.println("Its a higher number");
            }
        }

    }
}
