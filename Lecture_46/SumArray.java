package com.ravleen.Lecture_46;

import java.util.Scanner;

public class SumArray {
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int total = sumArray(arr);
        System.out.println("Sum of all elements = " + total);
        System.out.println("Time Complexity: O(n)");
    }
}
