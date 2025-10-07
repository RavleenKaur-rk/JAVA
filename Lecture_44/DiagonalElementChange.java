package com.ravleen.Lecture_44;

import java.util.Scanner;
import java.util.Arrays;
public class DiagonalElementChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] array = new int[row][col];
        int product = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = input.nextInt();
                if (i == j) {
                    product *= array[i][j];
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    array[i][j] = product;
                }
            }
        }

        for (int i = 0; i < row; i++) {
                 System.out.print(Arrays.toString(array[i]));
        }

    }
}
