package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.bonus.GlueList;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.list_handler.ListHandler;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.searching_algorithms.*;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms.BucketSorter;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.stopwatch.Stopwatch;

import java.util.Collections;

public class SearchingDemo {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        GlueList<Integer> list = ListHandler.createList();
        int size = ListHandler.MAX_SIZE - 222200000, bound = 20, index;
        ListHandler.populateListWithRandomNumbers(list, size, bound);
        System.out.println("Sorting the list...\n");
        BucketSorter.sort(list);
        int key = ListHandler.setKeyAtLast(list, 30);

        // Binary Search        =>      O(log n)
        System.out.println("Binary Search\t\t\t=>\t\tO(log n)");
        System.out.printf("Searching a list of size %,3d...\n", size);
        stopwatch.reset();
        index = BinarySearcher.search(list, key);
        System.out.printf(index == -1 ? "Not found\n" : "Found at index: %,3d\n", index);
        System.out.println(stopwatch);

        // Exponential Search   =>      O(log n)
        System.out.println("Exponential Search\t\t=>\t\tO(log n)");
        System.out.printf("Searching a list of size %,3d...\n", size);
        stopwatch.reset();
        index = ExponentialSearcher.search(list, key);
        System.out.printf(index == -1 ? "Not found\n" : "Found at index: %,3d\n", index);
        System.out.println(stopwatch);

        // Linear Search        =>      O(n)
        System.out.println("Linear Search\t\t\t=>\t\tO(n)");
        System.out.printf("Searching a list of size %,3d...\n", size);
        stopwatch.reset();
        index = LinearSearcher.search(list, key);
        System.out.printf(index == -1 ? "Not found\n" : "Found at index: %,3d\n", index);
        System.out.println(stopwatch);


    }
}

// SAMPLE OUTPUT:
/*
Creating list...

Populating list of size 309,999,999...

Sorting the list...

Binary Search			=>		O(log n)
Searching a list of size 309,999,999...
Found at index: 309,999,998
Elapsed time:	000:00:00:00:002

Exponential Search		=>		O(log n)
Searching a list of size 309,999,999...
Found at index: 309,999,998
Elapsed time:	000:00:00:00:008

Linear Search			=>		O(n)
Searching a list of size 309,999,999...
Found at index: 309,999,998
Elapsed time:	000:00:00:15:346

*/