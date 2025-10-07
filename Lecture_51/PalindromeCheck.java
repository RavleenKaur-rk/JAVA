package com.ravleen.Lecture_51;
import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindrome(String sentence) {
        String cleaned = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();

        if (isPalindrome(sentence)) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is not a palindrome.");
        }
    }
}
