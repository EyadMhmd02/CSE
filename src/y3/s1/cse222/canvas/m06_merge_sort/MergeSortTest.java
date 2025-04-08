package y3.s1.cse222.canvas.m06_merge_sort;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.bonus.GlueList;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms.MergeSorter;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.stopwatch.Stopwatch;

import java.util.Random;

class MergeSortTest {

    // Generate Random list
    public static GlueList<Integer> generateRandomList(int size) {
        Random random = new Random();
        GlueList<Integer> list = new GlueList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(size));
        }
        return list;
    }

    // y3.s2.ser315.week3.implementation_eghanem.Main Method to Test Merge Sort with Stopwatch
    public static void main(String[] args) {
        int size = 999999; // Size of the list

        // Generate random list
        GlueList<Integer> data = generateRandomList(size);

        // Create Stopwatch instance
        Stopwatch stopwatch = new Stopwatch();

        System.out.println("Sorting started...");

        // Perform Merge Sort
        MergeSorter.sort(data);

        System.out.println("Sorting finished.");

        // Print elapsed time
        System.out.println(stopwatch);
    }
}

/*
Sorting started...
Sorting finished.
Elapsed time:	000:00:00:02:341
*/