package y3.s1.cse222.canvas.m05_elementary_sorts;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.list_handler.ListHandler;

import java.util.ArrayList;

/**
 * This class contains a static method for sorting an ArrayList of integers using the Selection Sort algorithm.
 */
public class SelectionSorter {

    /**
     * Sorts the given ArrayList of integers in ascending order using the Selection Sort algorithm.
     *
     * @param list The ArrayList to be sorted.
     */
    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            swap(list, i, minIndex);
        }
    }

    /**
     * Swaps the elements at the given indices in the ArrayList.
     *
     * @param list The ArrayList in which to swap elements.
     * @param i    The index of the first element to swap.
     * @param j    The index of the second element to swap.
     */
    private static void swap(ArrayList<Integer> list, int i, int j) {
        ListHandler.swap(list, i, j);
    }
}
