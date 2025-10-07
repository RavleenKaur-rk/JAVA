package com.ravleen.Lecture_45;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = input.nextInt();
        System.out.println("Enter elements of array: ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Enter target: ");
        int target = input.nextInt();
        int answer = search(array,target);
        System.out.println(answer);
    }
    static int search (int[] array, int target){
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = start + (end-start) / 2;
             if(array[middle] == target)  {
                return middle;
            }
            else if (array[middle] < target) {
                 start = middle + 1;

            } else  {
                 end = middle - 1;
            }
        }
        return -1;
    }
}
