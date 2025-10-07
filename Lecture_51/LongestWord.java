package com.ravleen.Lecture_51;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a paragraph: ");
        String paragraph = in.nextLine();

        String[] words = paragraph.split("\\s+");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
    }
}