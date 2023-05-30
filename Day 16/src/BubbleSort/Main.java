package BubbleSort;

import static BubbleSort.BubbleSort.bubbleSort;
import static BubbleSort.BubbleSort.printArray;

class Main {

    public static void main(String args[]) {
        int arr[]={54,24,21,122,2,11,80, 2};
        int n=arr.length;
        bubbleSort(arr,n);
        System.out.println("Sorted array: ");
        printArray(arr,n);
    }
}