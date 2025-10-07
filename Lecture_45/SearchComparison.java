package com.ravleen.Lecture_45;

import java.util.Scanner;

public class SearchComparison {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers (sorted):");
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();

        System.out.print("Enter value to search: ");
        int key = in.nextInt();

        int pos1 = linearSearch(arr, key);
        int pos2 = binarySearch(arr, key);

        if (pos1 != -1)
            System.out.println("Linear Search: Found at position " + pos1);
        else
            System.out.println("Linear Search: Not found");

        if (pos2 != -1)
            System.out.println("Binary Search: Found at position " + pos2);
        else
            System.out.println("Binary Search: Not found");
    }
}
