package com.ravleen.Lecture_45;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = input.nextInt();
        System.out.println("Enter elements of array: ");
        int[] array = new int[size];
        for(int i=0 ; i<array.length ; i++){
             array[i] = input.nextInt();
        }
        System.out.println("Enter target: ");
        int target = input.nextInt();
        for(int i=0 ; i<array.length ; i++){
            if(array[i] == target){
                System.out.println(i);
            }
        }
    }
}
