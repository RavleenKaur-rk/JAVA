package com.ravleen.Lecture_50;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println("Reversed string: " + sb.toString());
    }
}
