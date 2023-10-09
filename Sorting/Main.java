package Sorting;

import Arrays.Easy.LargestElement;

public class Main {
    public static void main (String args[]) {
        SelectionSort selectionSort = new SelectionSort();
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        RecursiveBubbleSort recursiveBubbleSort = new RecursiveBubbleSort();
        RecursiveInsertionSort recursiveInsertionSort = new RecursiveInsertionSort();
        LargestElement largestElement = new LargestElement();
        // selectionSort.selectionSort(6);
        // bubbleSort.bubbleSort(6);
        // insertionSort.insertionSort(5);
        // mergeSort.mergeSort(5);
        // quickSort.quickSort(5);
        // recursiveInsertionSort.recursiveInsertionSort(5);
        largestElement.largestElement(5);
    }
}
