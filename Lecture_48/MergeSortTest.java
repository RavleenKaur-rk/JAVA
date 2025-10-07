package com.ravleen.Lecture_48;

import java.util.Arrays;

public class MergeSortTest {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] evenArray = {8, 4, 2, 6, 10, 12};
        int[] oddArray = {7, 3, 9, 1, 5};

        System.out.println("Original even-length array: " + Arrays.toString(evenArray));
        mergeSort(evenArray, 0, evenArray.length - 1);
        System.out.println("Sorted even-length array: " + Arrays.toString(evenArray));

        System.out.println("\nOriginal odd-length array: " + Arrays.toString(oddArray));
        mergeSort(oddArray, 0, oddArray.length - 1);
        System.out.println("Sorted odd-length array: " + Arrays.toString(oddArray));
    }
}
