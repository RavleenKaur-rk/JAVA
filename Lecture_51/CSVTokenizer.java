package com.ravleen.Lecture_51;
import java.util.StringTokenizer;

public class CSVTokenizer {
    public static void main(String[] args) {
        String csv = "apple,banana,grape";

        StringTokenizer st = new StringTokenizer(csv, ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
