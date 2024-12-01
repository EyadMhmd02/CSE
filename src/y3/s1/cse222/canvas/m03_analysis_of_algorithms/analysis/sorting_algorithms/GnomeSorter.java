package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.bonus.GlueList;

/**
 * A class that provides a gnome sort algorithm for sorting a GlueList of integers.
 */
public class GnomeSorter {
    /**
     * Sorts the given GlueList of integers in non-decreasing order using the gnome sort algorithm.
     *
     * @param list the GlueList to be sorted
     */
    public static void sort(GlueList<Integer> list) {
        int index = 0;

        while (index < list.size()) {
            if (index == 0 || list.get(index) >= list.get(index - 1)) {
                index++;
            } else {
                int temp = list.get(index);
                list.set(index, list.get(index - 1));
                list.set(index - 1, temp);
                index--;
            }
        }
    }
}