package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.bonus.GlueList;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.list_handler.ListHandler;

/**
 * A class that provides a comb sort algorithm for sorting a GlueList of integers.
 */
public class CombSorter {
    private static final double FACTOR = 1.3;

    /**
     * Sorts the given GlueList of integers in non-decreasing order using the comb sort algorithm.
     *
     * @param list the GlueList to be sorted
     */
    public static void sort(GlueList<Integer> list) {
        int gap = list.size();
        boolean swapped = true;

        while (gap > 1 || swapped) {
            gap = (int) (gap / FACTOR);
            if (gap < 1) {
                gap = 1;
            }
            swapped = false;

            for (int i = 0; i < list.size() - gap; i++) {
                int j = i + gap;
                if (list.get(i) > list.get(j)) {
                    ListHandler.swap(list, i, j);
                    swapped = true;
                }
            }
        }
    }
}