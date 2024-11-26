package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.list_handler.ListHandler;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms.*;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.stopwatch.Stopwatch;

import java.util.ArrayList;

class SortingDemo {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        ArrayList<Integer> list = ListHandler.createList();
        int size = Integer.MAX_VALUE / 1000;
        int bound = 20;
        ListHandler.populateListWithRandomNumbers(list, size, bound);

        // Shell Sort       =>      O(n^1.5)
        ListHandler.shuffle(list);
        System.out.println("Shell sort\t\t=>\t\tΩ(n log n), Θ(?), O(n^1.5)");
        System.out.printf("Sorting a list of size %d...\n", size);
        stopwatch.reset();
        ShellSorter.sort(list);
        System.out.println(stopwatch);

        // Heap Sort        =>      O(n log n)
        ListHandler.shuffle(list);
        System.out.println("Heap sort\t\t=>\t\tO(n log n)");
        System.out.printf("Sorting a list of size %d...\n", size);
        stopwatch.reset();
        HeapSorter.sort(list);
        System.out.println(stopwatch);

        // Merge Sort       =>      O(n log n)
        System.out.println("Merge sort\t\t=>\t\tO(n log n)");
        System.out.printf("Sorting a list of size %d...\n", size);
        stopwatch.reset();
        MergeSorter.sort(list);
        System.out.println(stopwatch);

        // Selection Sort  =>      O(n^2)
        System.out.println("Selection sort\t=>\t\tO(n^2)");
        System.out.printf("Sorting a list of size %d...\n", size);
        stopwatch.reset();
        SelectionSorter.sort(list);
        System.out.println(stopwatch);

        // Insertion Sort  =>      O(n^2)
        ListHandler.shuffle(list);
        System.out.println("Insertion sort\t=>\t\tO(n^2)");
        System.out.printf("Sorting a list of size %d...\n", size);
        stopwatch.reset();
        InsertionSorter.sort(list);
        System.out.println(stopwatch);

        // Bubble Sort      =>      O(n^2)
        ListHandler.shuffle(list);
        System.out.println("Bubble sort\t\t=>\t\tO(n^2)");
        System.out.printf("Sorting a list of size %d...\n", size);
        stopwatch.reset();
        BubbleSorter.sort(list);
        System.out.println(stopwatch);

        // Bogo Sort        =>      O(n n!)
        // impossible code, possibilities are 1 in about 549999!
        ListHandler.shuffle(list);
        System.out.println("Bogo sort\t\t=>\t\tO(n n!)");
        System.out.printf("Impossible code, possibilities are 1 in about %d!\nList will be shrunken ", size);
        size = 14;
        System.out.printf("to size %d\n\n", size);
        list = ListHandler.createList();
        ListHandler.populateListWithRandomNumbers(list, size, bound);
        System.out.println("Note that this sort is of unpredictable time.\n");
        System.out.printf("Sorting a list of size %d...\n", size);
        stopwatch.reset();
        BogoSorter.sort(list);
        System.out.println(stopwatch);
    }
}

// SAMPLE OUTPUT
/*
Creating list...

Populating list with size of 549999...

Merge sort		=>		O(n log n)
Sorting a list of size 549999...
Elapsed time: 00:00:00:392

Shuffling list...

Heap sort		=>		O(n log n)
Sorting a list of size 549999...
Elapsed time: 00:00:00:426

Shuffling list...

Quick sort		=>		O(n^2)
Sorting a list of size 549999...
Elapsed time: 00:00:34:162

Selection sort	=>		O(n^2)
Sorting a list of size 549999...
Elapsed time: 00:05:54:417

Shuffling list...

Insertion sort	=>		O(n^2)
Sorting a list of size 549999...
Elapsed time: 00:21:38:189

Shuffling list...

Bubble sort		=>		O(n^2)
Sorting a list of size 549999...
Elapsed time: 00:53:00:759

Shuffling list...

Bogo sort		=>		O(n n!)
Sorting a list of size 549999...

*/