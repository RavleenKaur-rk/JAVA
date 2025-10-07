package com.ravleen.Lecture_47;

import java.util.Scanner;

public class SelectionSortWithSwapCount {
    public static int selectionSortCountSwaps(int[] arr) {
        int swapCount = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swapCount++;
            }
        }

        return swapCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++)
            arr[i] = in.nextInt();

        int swaps = selectionSortCountSwaps(arr);

        System.out.print("Sorted array: ");
        for (int num : arr)
            System.out.print(num + " ");

        System.out.println("\nTotal number of swaps: " + swaps);
    }
}
