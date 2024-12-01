package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.bonus.GlueList;

/**
 * This class provides a static method for sorting an GlueList of integers using the Insertion Sort algorithm.
 */
public class InsertionSorter {

    /**
     * Sorts the given GlueList of integers in ascending order using the Insertion Sort algorithm.
     *
     * @param list The GlueList to be sorted.
     * @throws NullPointerException If the given list is null.
     */
    public static void sort(GlueList<Integer> list) {
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
