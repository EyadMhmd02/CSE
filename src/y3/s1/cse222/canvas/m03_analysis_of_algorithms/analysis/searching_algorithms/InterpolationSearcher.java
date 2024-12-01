package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.searching_algorithms;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.bonus.GlueList;

public class InterpolationSearcher {

    /**
     * Performs an interpolation search on the given GlueList to find the key integer.
     *
     * @param list The GlueList to search in.
     * @param key The key integer to find.
     * @return The index of the key integer in the GlueList, or -1 if not found.
     */
    public static int search(GlueList<Integer> list, int key) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high && key >= list.get(low) && key <= list.get(high)) {
            if (low == high) {
                if (list.get(low) == key) {
                    return low;
                } else {
                    return -1;
                }
            }

            int position = low + ((key - list.get(low)) * (high - low)) / (list.get(high) - list.get(low));

            if (list.get(position) == key) {
                return position;
            }

            if (list.get(position) < key) {
                low = position + 1;
            } else {
                high = position - 1;
            }
        }

        return -1;
    }
}