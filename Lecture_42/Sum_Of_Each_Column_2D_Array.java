package com.assignments.Lecture_42;

import java.util.Scanner;

public class Sum_Of_Each_Column_2D_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] array = new int[row][col];

        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++) {
                array[i][j] = input.nextInt();
            }
        }

        for(int j=0 ; j<col ; j++){
            int sum=0;
            for(int i=0 ; i<row ; i++){
                sum+=array[i][j];
            }
           System.out.println(j + "th Sum of each column: " + sum);
        }
    }
}
