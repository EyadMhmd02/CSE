package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.list_handler.ListHandler;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.searching_algorithms.*;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.stopwatch.Stopwatch;

import java.util.ArrayList;
import java.util.Collections;

public class SearchingDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = ListHandler.createList();
        int size = Integer.MAX_VALUE / 10;
        int bound = 20;
        ListHandler.populateListWithRandomNumbers(list, size, bound);
        System.out.println("Sorting the list...\n");
        Collections.sort(list);
        int key = ListHandler.setKeyAtLast(list, 30);

        // Binary Search        =>      O(log n)
        System.out.println("Binary Search\t\t\t=>\t\tO(log n)");
        System.out.printf("Searching a list of size %d...\n", size);
        Stopwatch stopwatch = new Stopwatch();
        int index = BinarySearcher.search(list, key);
        System.out.println(index == -1 ? "Not found" : "Found at index: " + index);
        System.out.println(stopwatch);

        // Linear Search        =>      O(n)
        System.out.println("Linear Search\t\t\t=>\t\tO(n)");
        System.out.printf("Searching a list of size %d...\n", size);
        stopwatch.reset();
        index = LinearSearcher.search(list, key);
        System.out.println(index == -1 ? "Not found" : "Found at index: " + index);
        System.out.println(stopwatch);
    }
}