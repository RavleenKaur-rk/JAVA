package com.ravleen.Lecture_47;
import java.util.Scanner;
public class SelectionSort {
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
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];

        System.out.println("Enter 6 numbers:");
        for (int i = 0; i < 6; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Array before sorting: ");
        for (int num : arr)
            System.out.print(num + " ");

        selectionSort(arr);

        System.out.print("\nArray after sorting: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}

