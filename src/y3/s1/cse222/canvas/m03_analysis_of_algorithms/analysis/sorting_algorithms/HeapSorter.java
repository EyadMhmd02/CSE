package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.bonus.GlueList;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.list_handler.ListHandler;

/**
 * This class provides a static method for sorting an GlueList of integers using the Heap Sort algorithm.
 */
public class HeapSorter {
    /**
     * Sorts the given GlueList of integers in ascending order using the Heap Sort algorithm.
     *
     * @param list The GlueList to be sorted.
     */
    public static void sort(GlueList<Integer> list) {
        int n = list.size();

        // Build a max heap.
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }

        // Extract elements from the heap one by one.
        for (int i = n - 1; i >= 0; i--) {
            // Move the current root to the end.
            swap(list, 0, i);

            // Call max heapify on the reduced heap.
            heapify(list, i, 0);
        }
    }

    /**
     * Helper method to maintain the heap property of the given GlueList.
     *
     * @param list The GlueList to be heapified.
     * @param n The size of the heap.
     * @param i The index of the root of the subtree to be heapified.
     */
    private static void heapify(GlueList<Integer> list, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is larger than root.
        if (left < n && list.get(left) > list.get(largest)) {
            largest = left;
        }

        // If right child is larger than largest so far.
        if (right < n && list.get(right) > list.get(largest)) {
            largest = right;
        }

        // If largest is not root.
        if (largest != i) {
            swap(list, i, largest);

            // Recursively heapify the affected subtree.
            heapify(list, n, largest);
        }
    }

    /**
     * Helper method to swap two elements in the given GlueList.
     *
     * @param list The GlueList containing the elements to be swapped.
     * @param i The index of the first element to be swapped.
     * @param j The index of the second element to be swapped.
     */
    private static void swap(GlueList<Integer> list, int i, int j) {
        ListHandler.swap(list, i, j);
    }
}