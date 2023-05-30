package QuickSort;

import static QuickSort.QuickSort.printArr;
import static QuickSort.QuickSort.quickSort;

public class Main {
    public static void main(String[] args)
    {
        int[] arr = { 10, 67, 88, 8, 67, 3, 1 };
        int N = arr.length;

        quickSort(arr, 0, N - 1);
        System.out.println("Sorted array:");
        printArr(arr);
    }
}

