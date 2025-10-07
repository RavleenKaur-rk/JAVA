package com.ravleen.Lecture_48;

public class QuickSortTrace {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            System.out.println("Calling quickSort(arr, " + low + ", " + high + ")");
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
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
        int[] arr = {4, 7, 3, 9, 1};

        System.out.print("Original array: ");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println("\n");

        quickSort(arr, 0, arr.length - 1);

        System.out.print("\nSorted array: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
