package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.bonus.GlueList;

/**
 * This class provides a merge sort algorithm for sorting an GlueList of Integers.
 */
public class MergeSorter {

    /**
     * Sorts the given GlueList of Integers using the merge sort algorithm.
     *
     * @param list The GlueList to be sorted.
     */
    public static void sort(GlueList<Integer> list) {
        if (list.size() > 1) {
            int mid = list.size() / 2;
            GlueList<Integer> left = new GlueList<>(list.subList(0, mid));
            GlueList<Integer> right = new GlueList<>(list.subList(mid, list.size()));

            sort(left);
            sort(right);

            merge(list, left, right);
        }
    }

    /**
     * Merges two sorted GlueLists into a single sorted GlueList.
     *
     * @param list The GlueList to store the merged result.
     * @param left The first sorted GlueList.
     * @param right The second sorted GlueList.
     */
    private static void merge(GlueList<Integer> list, GlueList<Integer> left, GlueList<Integer> right) {
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