package y3.s1.cse222.canvas.m03_analysis_of_algorithms;

import java.util.ArrayList;
import java.util.Collections;

class BogoSorter {
    public static void bogoSort(ArrayList<Integer> list) {
        while (!isListSorted(list)) {
            Collections.shuffle(list);
        }
    }

    private static boolean isListSorted(ArrayList<Integer> list) {
        if (list == null) return true;

        if (list.size() <= 1) {
            return true;
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }

        return true;
    }
}
