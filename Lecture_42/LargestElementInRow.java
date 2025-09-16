package com.assignments.Lecture_42;
import java.util.Arrays;
import java.util.Scanner;

public class LargestElementInRow {
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
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0 ; i<row ; i++){
            int max = array[i][0];
            for(int j=0 ; j<col ; j++){
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
            System.out.println(i + "th row largest element is " + max);
        }
    }
}
