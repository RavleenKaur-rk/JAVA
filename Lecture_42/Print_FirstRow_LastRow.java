package com.assignments.Lecture_42;

import java.util.Scanner;

public class Print_FirstRow_LastRow {
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

        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                if(i==0 || i==row-1) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
