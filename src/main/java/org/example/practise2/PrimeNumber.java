package org.example.practise2;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 3;

        System.out.println(checkPrime(number) ? "Number is prime": "Number is not prime");
    }

    private static boolean checkPrime(int number){
        if(number < 2)
            return false;
        int num = (int) Math.sqrt(number);
        while (num > 1) {
            if (number % num == 0) {
                return false;
            }
            num--;
        }
        return true;
    }
}
