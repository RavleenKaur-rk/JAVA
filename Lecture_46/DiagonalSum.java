package com.ravleen.Lecture_46;

import java.util.Scanner;

public class DiagonalSum {
    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = in.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int result = diagonalSum(matrix);
        System.out.println("Sum of main diagonal elements = " + result);
    }
}
