package com.ravleen.Lecture_47;

public class InsertionSortComparison {
    public static int insertionSortCountComparisons(int[] arr) {
        int comparisons = 0;
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0) {
                comparisons++;
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                } else {
                    break;
                }
            }
            arr[j + 1] = key;
        }
        return comparisons;
    }

    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] reversedArray = {5, 4, 3, 2, 1};

        int comparisonsSorted = insertionSortCountComparisons(sortedArray.clone());
        int comparisonsReversed = insertionSortCountComparisons(reversedArray.clone());

        System.out.print("Sorted array after insertion sort: ");
        printArray(sortedArray);

        System.out.print("Reversed array after insertion sort: ");
        printArray(reversedArray);

        System.out.println("Comparisons on already sorted array: " + comparisonsSorted);
        System.out.println("Comparisons on reversed array: " + comparisonsReversed);
    }
}
