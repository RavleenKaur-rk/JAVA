package com.ravleen.Lecture_48;

import java.util.Scanner;

public class QuickSortDescending {

    public static void quickSortDesc(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionDesc(arr, low, high);
            quickSortDesc(arr, low, pivotIndex - 1);
            quickSortDesc(arr, pivotIndex + 1, high);
        }
    }

    public static int partitionDesc(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] >= pivot) { // Change comparison for descending
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[8];

        System.out.println("Enter 8 integers:");
        for (int i = 0; i < 8; i++)
            arr[i] = in.nextInt();

        quickSortDesc(arr, 0, arr.length - 1);

        System.out.print("Sorted array in descending order: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
