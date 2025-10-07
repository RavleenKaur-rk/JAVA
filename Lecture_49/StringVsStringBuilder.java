package com.ravleen.Lecture_49;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        int n = 10000;

        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + "a";
        }
        long end = System.nanoTime();
        System.out.println("Time using String: " + (end - start) + " ns");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        end = System.nanoTime();
        System.out.println("Time using StringBuilder: " + (end - start) + " ns");
    }
}
