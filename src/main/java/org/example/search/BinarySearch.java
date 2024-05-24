package org.example.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(a, 9));
        System.out.println(binarySearch(a, 11));
    }

    private static int binarySearch(int[] numbers, int numberToFind) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            int actual = numbers[middle];
            if (numberToFind == actual)
                return middle;
            if (numberToFind < actual) {
                high = middle - 1;
            }
            if (numberToFind > actual) {
                low = middle + 1;
            }
        }
        return -1;
    }
}
