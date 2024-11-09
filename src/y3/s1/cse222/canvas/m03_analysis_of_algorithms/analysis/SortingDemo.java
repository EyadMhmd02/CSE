package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.list_handler.ListHandler;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms.*;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.stopwatch.Stopwatch;

import java.util.ArrayList;

class SortingDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = ListHandler.createList();
        int size = 549999;
        int bound = 20;
        ListHandler.populateListWithRandomNumbers(list, size, bound);

        // Merge Sort       =>      O(n log n)
        System.out.println("Merge sort\t\t=>\t\tO(n log n)");
        System.out.printf("Sorting a list of size %d...\n", size);
        Stopwatch stopwatch = new Stopwatch();
        MergeSorter.sort(list);
        System.out.println(stopwatch);

        // Heap Sort        =>      O(n log n)
        ListHandler.shuffle(list);
        System.out.println("Heap sort\t\t=>\t\tO(n log n)");
        System.out.printf("Sorting a list of size %d...\n", size);
        stopwatch.reset();
        HeapSorter.sort(list);
        System.out.println(stopwatch);

        // Quick Sort       =>      O(n^2)
        ListHandler.shuffle(list);
        System.out.println("Quick sort\t\t=>\t\tO(n^2)");
        System.out.printf("Sorting a list of size %d...\n", size);
        stopwatch.reset();
        QuickSorter.sort(list, 0, size - 1);
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
        ListHandler.shuffle(list);
        System.out.println("Bogo sort\t\t=>\t\tO(n n!)");
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