package com.ravleen.Lecture_44;

import java.util.Scanner;

public class FactorialWithRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(factorial(n));
    }
    static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }
}
