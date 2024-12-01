package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.bonus.GlueList;

import java.util.ArrayList;

/**
 * A class that provides a bucket sort algorithm for sorting a GlueList of integers.
 */
public class BucketSorter {
    /**
     * Sorts the given GlueList of integers in non-decreasing order using the bucket sort algorithm.
     *
     * @param list the GlueList to be sorted
     */
    public static void sort(GlueList<Integer> list) {
        int max = findMax(list);
        ArrayList<GlueList<Integer>> buckets = new ArrayList<>();

        // Create empty buckets
        for (int i = 0; i <= max; i++) {
            buckets.add(new GlueList<>());
        }

        // Distribute elements into buckets
        for (int i = 0; i < list.size(); i++) {
            buckets.get(list.get(i)).add(list.get(i));
        }

        // Concatenate buckets
        int index = 0;
        for (GlueList<Integer> bucket : buckets) {
            for (int i = 0; i < bucket.size(); i++) {
                list.set(index++, bucket.get(i));
            }
        }
    }

    /**
     * Finds the maximum value in the given GlueList.
     *
     * @param list the GlueList to search
     * @return the maximum value in the GlueList
     */
    private static int findMax(GlueList<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}
