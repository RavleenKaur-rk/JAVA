package com.ravleen.Lecture_49;
public class ReplaceVowelsWithStar {
    public static void main(String[] args) {
        String str = "Hello";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                result += "*";
            } else {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
