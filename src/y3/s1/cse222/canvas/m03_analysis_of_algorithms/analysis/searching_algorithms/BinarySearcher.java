package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.searching_algorithms;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.bonus.GlueList;

/**
 * A class that implements the binary search algorithm for searching an element in a sorted GlueList.
 */
public class BinarySearcher {

    /**
     * Searches for the given key in the sorted GlueList and returns the index of the first occurrence.
     * If the key is not found, returns -1.
     *
     * @param list The sorted GlueList to search in.
     * @param key  The key to search for.
     * @return The index of the first occurrence of the key, or -1 if not found.
     */
    public static int search(GlueList<Integer> list, int key) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) == key) {
                return mid;
            }

            if (list.get(mid) < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    /**
     * Searches for the given key in the sorted GlueList and returns the index of the last occurrence.
     * If the key is not found, returns -1.
     *
     * @param list The sorted GlueList to search in.
     * @param key  The key to search for.
     * @return The index of the last occurrence of the key, or -1 if not found.
     */
    public static int searchLastOccurrence(GlueList<Integer> list, int key) {
        int left = 0;
        int right = list.size() - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) == key) {
                result = mid;
                left = mid + 1;
            } else if (list.get(mid) < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}