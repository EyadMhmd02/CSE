package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.list_handler.ListHandler;

import java.util.ArrayList;

/**
 * This class provides a static method for sorting an ArrayList of Integers using the QuickSort algorithm.
 */
public class QuickSorter {

    /**
     * Sorts the given list of integers in ascending order using the QuickSort algorithm.
     *
     * @param list The list of integers to be sorted.
     * @param low The starting index of the subarray to be sorted.
     * @param high The ending index of the subarray to be sorted.
     */
    public static void sort(ArrayList<Integer> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            sort(list, low, pivotIndex - 1);
            sort(list, pivotIndex + 1, high);
        }
    }

    /**
     * Partitions the given list of integers around a pivot element, placing all elements smaller than the pivot
     * to its left and all elements greater than the pivot to its right.
     *
     * @param list The list of integers to be partitioned.
     * @param low The starting index of the subarray to be partitioned.
     * @param high The ending index of the subarray to be partitioned.
     * @return The index of the pivot element after partitioning.
     */
    private static int partition(ArrayList<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (list.get(j) < pivot) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, high);
        return i + 1;
    }

    /**
     * Swaps the elements at the given indices in the given list.
     *
     * @param list The list of integers where the elements are to be swapped.
     * @param i The index of the first element to be swapped.
     * @param j The index of the second element to be swapped.
     */
    private static void swap(ArrayList<Integer> list, int i, int j) {
        ListHandler.swap(list, i, j);
    }
}
