package com.ravleen.Lecture_47;

public class TraceSelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            System.out.print("After pass " + (i + 1) + ": ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 8, 4};

        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        selectionSort(arr);

        System.out.print("\nSorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
