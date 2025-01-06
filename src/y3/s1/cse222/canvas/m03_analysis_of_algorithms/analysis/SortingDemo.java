package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.bonus.GlueList;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.list_handler.ListHandler;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms.*;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.stopwatch.Stopwatch;

class SortingDemo {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        GlueList<Integer> list = ListHandler.createList();
        int size = ListHandler.MAX_SIZE - 222200000;
//        int size = 100000;
        int bound = 20;
        ListHandler.populateListWithRandomNumbers(list, size, bound);

        // Bucket Sort     =>      O(n + k)
        ListHandler.shuffle(list);
        System.out.println("Bucket sort\t\t=>\t\tO(n + k)");
        System.out.printf("Sorting a list of size %,3d...\n", size);
        stopwatch.reset();
        BucketSorter.sort(list);
        System.out.println(stopwatch);

        // Merge Sort       =>      O(n log n)
        ListHandler.shuffle(list);
        System.out.println("Merge sort\t\t=>\t\tO(n log n)");
        System.out.printf("Sorting a list of size %,3d...\n", size);
        stopwatch.reset();
        MergeSorter.sort(list);
        System.out.println(stopwatch);

        // Comb Sort       =>      O(n log n)
        ListHandler.shuffle(list);
        System.out.println("Comb sort\t\t=>\t\tO(n log n)");
        System.out.printf("Sorting a list of size %,3d...\n", size);
        stopwatch.reset();
        CombSorter.sort(list);
        System.out.println(stopwatch);

        // Heap Sort        =>      O(n log n)
        ListHandler.shuffle(list);
        System.out.println("Heap sort\t\t=>\t\tO(n log n)");
        System.out.printf("Sorting a list of size %,3d...\n", size);
        stopwatch.reset();
        HeapSorter.sort(list);
        System.out.println(stopwatch);

        // Shell Sort       =>      O(n¹·⁵)
        ListHandler.shuffle(list);
        System.out.println("Shell sort\t\t=>\t\tΩ(n log n), Θ(?), O(n¹·⁵)");
        System.out.printf("Sorting a list of size %,3d...\n", size);
        stopwatch.reset();
        ShellSorter.sort(list);
        System.out.println(stopwatch);

        // Insertion Sort  =>      O(n²)
        size /= 1000;
        System.out.println("size /= 1000\n");
        list = ListHandler.createList();
        ListHandler.populateListWithRandomNumbers(list, size, bound);
//        ListHandler.shuffle(list);
        System.out.println("Insertion sort\t=>\t\tO(n²)");
        System.out.printf("Sorting a list of size %,3d...\n", size);
        stopwatch.reset();
        InsertionSorter.sort(list);
        System.out.println(stopwatch);

        // Bubble Sort      =>      O(n²)
        ListHandler.shuffle(list);
        System.out.println("Bubble sort\t\t=>\t\tO(n²)");
        System.out.printf("Sorting a list of size %,3d...\n", size);
        stopwatch.reset();
        BubbleSorter.sort(list);
        System.out.println(stopwatch);

        // Selection Sort  =>      O(n²)
        ListHandler.shuffle(list);
        System.out.println("Selection sort\t=>\t\tO(n²)");
        System.out.printf("Sorting a list of size %,3d...\n", size);
        stopwatch.reset();
        SelectionSorter.sort(list);
        System.out.println(stopwatch);

        // Gnome Sort       =>      O(n²)
        ListHandler.shuffle(list);
        System.out.println("Gnome sort\t\t=>\t\tO(n²)");
        System.out.printf("Sorting a list of size %,3d...\n", size);
        stopwatch.reset();
        GnomeSorter.sort(list);
        System.out.println(stopwatch);

        // Bogo Sort        =>      O(n n!)
        // impossible code, possibilities are 1 in about size!
        ListHandler.shuffle(list);
        System.out.println("Bogo sort\t\t=>\t\tO(n n!)");
        System.out.printf("Impossible code, possibilities are 1 in about %,3d!\nList will be shrunken ", size);
        size = 14;
        System.out.printf("to size %,3d\n\n", size);
        list = ListHandler.createList();
        ListHandler.populateListWithRandomNumbers(list, size, bound);
        System.out.println("Note that this sort is of unpredictable time.\n");
        System.out.printf("Sorting a list of size %,3d...\n", size);
        stopwatch.reset();
        BogoSorter.sort(list);
        System.out.println(stopwatch);
    }
}

// SAMPLE OUTPUT
/*
Creating list...

Populating list of size 309,999,999...

Shuffling list...

Bucket sort		=>		O(n + k)
Sorting a list of size 309,999,999...
Elapsed time:	000:00:01:22:453

Shuffling list...

Merge sort		=>		O(n log n)
Sorting a list of size 309,999,999...
Elapsed time:	000:00:14:02:331

Shuffling list...

Comb sort		=>		O(n log n)
Sorting a list of size 309,999,999...
Elapsed time:	000:00:31:40:694

Shuffling list...

Heap sort		=>		O(n log n)
Sorting a list of size 309,999,999...
Elapsed time:	000:01:04:06:393

Shuffling list...

Shell sort		=>		Ω(n log n), Θ(?), O(n¹·⁵)
Sorting a list of size 309,999,999...
Elapsed time:	000:00:17:07:259

size /= 1000

Creating list...

Populating list of size 309,999...

Insertion sort	=>		O(n²)
Sorting a list of size 309,999...
Elapsed time:	000:00:29:31:893

Shuffling list...

Bubble sort		=>		O(n²)
Sorting a list of size 309,999...
Elapsed time:	000:01:51:31:017

Shuffling list...

Selection sort	=>		O(n²)
Sorting a list of size 309,999...
Elapsed time:	000:00:34:22:429

Shuffling list...

Gnome sort		=>		O(n²)
Sorting a list of size 309,999...
Elapsed time:	000:01:19:10:667

Shuffling list...

Bogo sort		=>		O(n n!)
Impossible code, possibilities are 1 in about 309,999!
List will be shrunken to size  14

Creating list...

Populating list of size  14...

Note that this sort is of unpredictable time.

Sorting a list of size  14...
Elapsed time:	000:00:56:34:974

*/