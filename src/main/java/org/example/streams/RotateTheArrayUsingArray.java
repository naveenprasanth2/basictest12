package org.example.streams;

import java.util.Arrays;

public class RotateTheArrayUsingArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println(Arrays.toString(rotateArray(array, k)));
    }


    static int[] rotateArray(int[] array, int times) {
        while (times > 0) {
            int temp = array[array.length - 1];
            for (int i = array.length - 2; i >= 0; i--) {
                array[i + 1] = array[i];
            }
            array[0] = temp;
            times--;
        }
        return array;
    }
}
