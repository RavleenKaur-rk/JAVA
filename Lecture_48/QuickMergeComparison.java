package com.ravleen.Lecture_48;

public class QuickMergeComparison {

    static int quickComparisons = 0;
    static int mergeComparisons = 0;

    // Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            quickComparisons++;
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            mergeComparisons++;
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        int[] arrQuick = arr.clone();
        int[] arrMerge = arr.clone();

        quickSort(arrQuick, 0, arrQuick.length - 1);
        mergeSort(arrMerge, 0, arrMerge.length - 1);

        System.out.print("Sorted array by Quick Sort: ");
        for (int num : arrQuick) System.out.print(num + " ");
        System.out.println();

        System.out.print("Sorted array by Merge Sort: ");
        for (int num : arrMerge) System.out.print(num + " ");
        System.out.println();

        System.out.println("Total comparisons in Quick Sort: " + quickComparisons);
        System.out.println("Total comparisons in Merge Sort: " + mergeComparisons);
    }
}
