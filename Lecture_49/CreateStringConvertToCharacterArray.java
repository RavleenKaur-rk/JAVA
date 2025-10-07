package com.ravleen.Lecture_49;
public class CreateStringConvertToCharacterArray {
    public static void main(String[] args) {
        String str = "Hello";
        char[] charArray = str.toCharArray();
        charArray[0] = 'A';
        System.out.println(str);
        System.out.println(charArray);
    }
}
