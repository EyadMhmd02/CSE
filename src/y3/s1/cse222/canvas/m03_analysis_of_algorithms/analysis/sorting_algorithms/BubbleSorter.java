package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.bonus.GlueList;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.list_handler.ListHandler;

/**
 * This class provides a static method for sorting an GlueList of integers using the Bubble Sort algorithm.
 */
public class BubbleSorter {

    /**
     * Sorts the given GlueList of integers in ascending order using the Bubble Sort algorithm.
     *
     * @param list The GlueList to be sorted.
     */
    public static void sort(GlueList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    ListHandler.swap(list, j, j + 1);
                }
            }
        }
    }
}
