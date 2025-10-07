package com.ravleen.Lecture_51;
import java.util.Scanner;
import java.util.StringTokenizer;
public class WordCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine();
        StringTokenizer st = new StringTokenizer(sentence);
        int wordCount = st.countTokens();
        System.out.println("Number of words: " + wordCount);
    }
}