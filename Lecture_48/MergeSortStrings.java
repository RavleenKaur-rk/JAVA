package com.ravleen.Lecture_48;

import java.util.Scanner;

public class MergeSortStrings {

    public static void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(String[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        String[] L = new String[n1];
        String[] R = new String[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
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
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = in.nextInt();
        in.nextLine();

        String[] arr = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++)
            arr[i] = in.nextLine();

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted strings:");
        for (String str : arr)
            System.out.println(str);
    }
}
