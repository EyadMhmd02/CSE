package y1.s2.Modules.Module5;

import y1.s2.Modules.Module5.cse205_src_mod_05.sorting_section_02.InsertionSorter;
import y1.s2.Modules.Module5.cse205_src_mod_05.sorting_section_03.SelectionSorter;
import y1.s2.Modules.Module5.cse205_src_mod_05.sorting_section_12.MergeSorter;
import y1.s2.Sections.SortingAlgorithms.heap_sort.HeapSort;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Random;

public class SortingDemo {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>(); // n
        final int SIZE = 100000;

        System.out.println("populating list...");
        populateList(random, list, SIZE);

        System.out.println("sorting list...");

        Instant start = Instant.now();
//        BogoSorter.bogoSort(list); // O(n!)
//        InsertionSorter.insertionSort(list, InsertionSorter.SORT_ASCENDING); // O(n^2)
//        SelectionSorter.selectionSort(list, SelectionSorter.SORT_ASCENDING); // O(n^2)
//        MergeSorter.mergeSort(list); // O(n log n)
        HeapSort.heapSort(list); // O(n log n)
        Instant end = Instant.now();

//        printList(list);

        Duration timeElapsed = Duration.between(start, end);
        System.out.printf("Time taken: %.3f seconds", (double) timeElapsed.toMillis() / 1000);
    }

    private static void printList(ArrayList<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    private static void populateList(Random random, ArrayList<Integer> list, int SIZE) {
        for (int i = 0; i < SIZE; i++) {
            list.add(random.nextInt(0, 100));
        }
    }
}
