package org.example.practise3;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        String[] rps = {"r", "p", "s"};
        Random random = new Random();
        while (true) {
            int number = random.nextInt(rps.length + 1);
            System.out.println("Please enter your move r, p, s");
            Scanner scanner = new Scanner(System.in);
            String userMove = scanner.nextLine();
            if (userMove.equals(rps[number])) {
                System.out.println("Hurray, its correct");
                break;
            } else {
                System.out.println("Its wrong try again");
            }
        }

    }
}
