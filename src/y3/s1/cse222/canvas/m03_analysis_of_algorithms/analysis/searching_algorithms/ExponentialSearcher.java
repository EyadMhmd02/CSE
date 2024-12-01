package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.searching_algorithms;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.bonus.GlueList;

/**
 * This class implements an exponential search algorithm.
 */
public class ExponentialSearcher {

    /**
     * Performs an exponential search on the given GlueList to find the key integer.
     *
     * @param list The GlueList to search in.
     * @param key The key integer to find.
     * @return The index of the key integer in the GlueList, or -1 if not found.
     */
    public static int search(GlueList<Integer> list, int key) {
        int bound = 1;
        int index = -1;

        // Find the range where the key could be located
        while (bound < list.size() && list.get(bound) <= key) {
            bound *= 2;
        }

        // Perform a binary search within the found range
        int low = bound / 2;
        int high = Math.min(bound, list.size() - 1);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (list.get(mid) == key) {
                index = mid;
                break;
            } else if (list.get(mid) < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return index;
    }
}