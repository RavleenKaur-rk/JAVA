package com.ravleen.Lecture_47;

public class InsertionSortDescending {
    public static void insertionSortDesc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {20, 50, 40, 10, 30};

        System.out.print("Array before sorting: ");
        for (int num : arr)
            System.out.print(num + " ");

        insertionSortDesc(arr);

        System.out.print("\nArray after sorting (descending): ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
