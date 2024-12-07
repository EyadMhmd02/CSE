package y3.s1.cse222.canvas.m05_elementary_sorts;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.bonus.GlueList;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.list_handler.ListHandler;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms.MergeSorter;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.stopwatch.Stopwatch;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();

        GlueList<Integer> list = ListHandler.createList();
        ListHandler.populateListWithRandomNumbers(list, 9999999, 10);

        System.out.println("Sorting...\n");

        Collections.shuffle(list);
        System.out.println("shell sorting...");
        stopwatch.reset();
        ShellSorter.sort(list); // Better than O(n^2)
        System.out.println(stopwatch);

        Collections.shuffle(list);
        System.out.println("merge sorting...");
        stopwatch.reset();
        MergeSorter.sort(list); // O(n log n)
        System.out.println(stopwatch);


        Collections.shuffle(list);
        System.out.println("selection sorting...");
        stopwatch.reset();
        SelectionSorter.sort(list); // O(n^2)
        System.out.println(stopwatch);

        Collections.shuffle(list);
        System.out.println("insertion sorting...");
        stopwatch.reset();
        InsertionSorter.sort(list); // O(n^2)
        System.out.println(stopwatch);
    }
}
