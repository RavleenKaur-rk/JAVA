package com.ravleen.Lecture_51;
import java.util.Scanner;

public class ReverseLowercaseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();

        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println("Reversed string: " + sb.toString());
    }
}
