package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.searching_algorithms;

import java.util.ArrayList;

/**
 * A class that implements the linear search algorithm for searching an element in an ArrayList.
 */
public class LinearSearcher {

    /**
     * Searches for the given key in the ArrayList and returns the index of the first occurrence.
     * If the key is not found, returns -1.
     *
     * @param list The ArrayList to search in.
     * @param key  The key to search for.
     * @return The index of the first occurrence of the key, or -1 if not found.
     */
    public static int search(ArrayList<Integer> list, int key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Searches for the given key in the ArrayList and returns the index of the last occurrence.
     * If the key is not found, returns -1.
     *
     * @param list The ArrayList to search in.
     * @param key  The key to search for.
     * @return The index of the last occurrence of the key, or -1 if not found.
     */
    public static int searchLastOccurrence(ArrayList<Integer> list, int key) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == key) {
                return i;
            }
        }
        return -1;
    }
}
