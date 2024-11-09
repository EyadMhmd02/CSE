package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms;

import java.util.ArrayList;

/**
 * This class provides a static method for sorting an ArrayList of integers using the Insertion Sort algorithm.
 */
public class InsertionSorter {

    /**
     * Sorts the given ArrayList of integers in ascending order using the Insertion Sort algorithm.
     *
     * @param list The ArrayList to be sorted.
     * @throws NullPointerException If the given list is null.
     */
    public static void sort(ArrayList<Integer> list) {
        if (list == null) {
            throw new NullPointerException("The given list is null.");
        }

        for (int i = 1; i < list.size(); i++) {
            int key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
    }
}
