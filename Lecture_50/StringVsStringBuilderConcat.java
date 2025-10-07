package com.ravleen.Lecture_50;
public class StringVsStringBuilderConcat {
    public static void main(String[] args) {
        int n = 1000;

        // Using String
        long startString = System.nanoTime();
        String str = "";
        for (int i = 1; i <= n; i++) {
            str += i;
        }
        long endString = System.nanoTime();
        System.out.println("Time using String: " + (endString - startString) + " ns");

        // Using StringBuilder
        long startSB = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }
        long endSB = System.nanoTime();
        System.out.println("Time using StringBuilder: " + (endSB - startSB) + " ns");
    }
}
