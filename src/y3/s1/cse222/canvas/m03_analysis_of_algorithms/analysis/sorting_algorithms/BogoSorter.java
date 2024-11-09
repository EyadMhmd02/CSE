package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.list_handler.ListHandler;

import java.util.ArrayList;
import java.util.Collections;

public class BogoSorter {
    public static void sort(ArrayList<Integer> list) {
        while (!isListSorted(list)) {
            Collections.shuffle(list);
        }
    }

    private static boolean isListSorted(ArrayList<Integer> list) {
        return ListHandler.isSorted(list);
    }
}
