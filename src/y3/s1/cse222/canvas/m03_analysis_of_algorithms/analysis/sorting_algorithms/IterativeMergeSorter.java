package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms;

import java.util.ArrayList;

/**
 * Iterative implementation of Merge Sort algorithm using ArrayList.
 *
 * @author Tabnine
 */
public class IterativeMergeSorter {

    /**
     * Merges two sorted sub-lists of arr[].
     * First sub-list is arr[l..m]
     * Second sub-list is arr[m+1..r]
     */
    private static void merge(ArrayList<Integer> arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        ArrayList<Integer> L = new ArrayList<>(n1);
        ArrayList<Integer> R = new ArrayList<>(n2);

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L.add(arr.get(l + i));
        for (int j = 0; j < n2; ++j)
            R.add(arr.get(m + 1 + j));

        // Merge the temp arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray
        int k = l;
        while (i < n1 && j < n2) {
            if (L.get(i) <= R.get(j)) {
                arr.set(k, L.get(i));
                i++;
            } else {
                arr.set(k, R.get(j));
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr.set(k, L.get(i));
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr.set(k, R.get(j));
            j++;
            k++;
        }
    }

    /**
     * Iterative merge sort function to sort arr[l..r]
     */
    public static void sort(ArrayList<Integer> arr) {
        int n = arr.size();

        // Start with subarray size 1 and merge subarrays of size 1
        // until size of subarray becomes n
        for (int curr_size = 1; curr_size <= n - 1; curr_size = 2 * curr_size) {
            // Pick starting point of different subarrays of current size
            for (int left_start = 0; left_start < n - 1; left_start += 2 * curr_size) {
                // Find ending point of left subarray
                // mid+1 is starting point of right
                int mid = Math.min(left_start + curr_size - 1, n - 1);

                int right_end = Math.min(left_start + 2 * curr_size - 1, n - 1);

                // Merge subarrays arr[left_start...mid] and arr[mid+1...right_end]
                merge(arr, left_start, mid, right_end);
            }
        }
    }
}
