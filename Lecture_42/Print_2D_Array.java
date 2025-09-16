package com.assignments.Lecture_42;
import java.util.Scanner;
public class Print_2D_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[3][3];

        for(int i=0 ; i<array.length ; i++){
            for(int j=0 ; j<array.length ; j++){
                 array[i][j] = input.nextInt();
            }
        }

        for(int i=0 ; i<array.length ; i++){
            for(int j=0 ; j<array.length ; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
