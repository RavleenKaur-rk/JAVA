package com.ravleen.Lecture_44;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();

        int[] array = new int[row];
        for(int i=0 ; i<row ; i++){

                array[i] = input.nextInt();

        }
        int target = input.nextInt();
        System.out.println(binarySearch(array,1,1,target));
    }
    static int binarySearch(int[] array , int left , int right , int target){
        if(left>right) return -1;
        int mid = (left + right)/2;
        if(array[mid] == target) return  mid;
        else if(array[mid] > target) return binarySearch(array,left,mid-1,target);
        else return binarySearch(array,mid+1,right,target);
    }

}
