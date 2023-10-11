package Sorting;

import Arrays.Easy.ArrayIsSortedCheck;
import Arrays.Easy.LargestElement;
import Arrays.Easy.RemoveDuplicates;
import Arrays.Easy.SecondLargestAndSecondSmallestElement;

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
        SecondLargestAndSecondSmallestElement secondLargestAndSecondSmallestElement = new SecondLargestAndSecondSmallestElement();
        ArrayIsSortedCheck arrayIsSortedCheck = new ArrayIsSortedCheck();
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        // selectionSort.selectionSort(6);
        // bubbleSort.bubbleSort(6);
        // insertionSort.insertionSort(5);
        // mergeSort.mergeSort(5);
        // quickSort.quickSort(5);
        // recursiveInsertionSort.recursiveInsertionSort(5);
        // largestElement.largestElement(5);
        // secondLargestAndSecondSmallestElement.secondLargestAndSecondSmallestElement(6);
        // arrayIsSortedCheck.arrayIsSortedCheck(5);
        removeDuplicates.removeDuplicates(7); //An integer array sorted in non-decreasing order
    }
}
