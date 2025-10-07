package com.ravleen.Lecture_46;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arrays = {3, 43, 1, -12, 43, -90};
        selectionSort(arrays);
        System.out.println(Arrays.toString(arrays));
    }

    static void selectionSort(int[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[j] < arrays[min_index]) {
                    min_index = j;
                }
            }
            int temp = arrays[i];
            arrays[i] = arrays[min_index];
            arrays[min_index] = temp;
        }
    }
}