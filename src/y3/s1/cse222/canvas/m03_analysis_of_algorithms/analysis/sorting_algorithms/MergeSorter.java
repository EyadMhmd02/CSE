package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms;

import java.util.ArrayList;

/**
 * This class provides a merge sort algorithm for sorting an ArrayList of Integers.
 */
public class MergeSorter {

    /**
     * Sorts the given ArrayList of Integers using the merge sort algorithm.
     *
     * @param list The ArrayList to be sorted.
     */
    public static void sort(ArrayList<Integer> list) {
        if (list.size() > 1) {
            int mid = list.size() / 2;
            ArrayList<Integer> left = new ArrayList<>(list.subList(0, mid));
            ArrayList<Integer> right = new ArrayList<>(list.subList(mid, list.size()));

            sort(left);
            sort(right);

            merge(list, left, right);
        }
    }

    /**
     * Merges two sorted ArrayLists into a single sorted ArrayList.
     *
     * @param list The ArrayList to store the merged result.
     * @param left The first sorted ArrayList.
     * @param right The second sorted ArrayList.
     */
    private static void merge(ArrayList<Integer> list, ArrayList<Integer> left, ArrayList<Integer> right) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                list.set(k, left.get(i));
                i++;
            } else {
                list.set(k, right.get(j));
                j++;
            }
            k++;
        }

        while (i < left.size()) {
            list.set(k, left.get(i));
            i++;
            k++;
        }

        while (j < right.size()) {
            list.set(k, right.get(j));
            j++;
            k++;
        }
    }
}