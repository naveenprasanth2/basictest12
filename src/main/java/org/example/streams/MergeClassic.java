package org.example.streams;

import java.util.Arrays;

public class MergeClassic {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6, 8};
        int[] c = mergeSortedArray(a, b);

        System.out.println(Arrays.toString(c));
    }


    static int[] mergeSortedArray(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k++] = a[i];
                i++;
            } else {
                result[k++] = b[j];
                j++;
            }
        }

        while (i < a.length){
            result[k++] = a[i++];
        }

        while (j < b.length){
            result[k++] = b[j++];
        }

        return result;
    }
}
