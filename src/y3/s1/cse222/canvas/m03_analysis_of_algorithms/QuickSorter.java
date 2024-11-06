package y3.s1.cse222.canvas.m03_analysis_of_algorithms;

import java.util.ArrayList;

public class QuickSorter {
    /**
     * Performs the quicksort algorithm on the given list of integers.
     *
     * @param list The list to be sorted.
     * @param low The starting index of the subarray to be sorted.
     * @param high The ending index of the subarray to be sorted.
     */
    public static void quickSort(ArrayList<Integer> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    /**
     * Partitions the given list around a pivot element.
     *
     * This method selects the last element as the pivot and partitions the list
     * such that all elements smaller than or equal to the pivot are moved to its left,
     * and all elements greater than the pivot are moved to its right.
     *
     * @param list The ArrayList of integers to be partitioned.
     * @param low The starting index of the subarray to be partitioned.
     * @param high The ending index of the subarray to be partitioned.
     * @return The index of the pivot element after partitioning.
     */
    private static int partition(ArrayList<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (list.get(j) <= pivot) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, high);
        return i + 1;
    }

    /**
     * Swaps two elements in the given ArrayList of integers.
     *
     * This method exchanges the positions of two elements in the list specified by their indices.
     *
     * @param list The ArrayList of integers in which elements are to be swapped.
     * @param i The index of the first element to be swapped.
     * @param j The index of the second element to be swapped.
     */
    private static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
