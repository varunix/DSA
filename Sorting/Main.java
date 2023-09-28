package Sorting;

public class Main {
    public static void main (String args[]) {
        SelectionSort selectionSort = new SelectionSort();
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        // selectionSort.selectionSort(6);
        // bubbleSort.bubbleSort(6);
        // insertionSort.insertionSort(5);
        mergeSort.mergeSort(5);
    }
}
