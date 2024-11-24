package y3.s1.cse222.canvas.m05_elementary_sorts;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.list_handler.ListHandler;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class contains a static method for sorting an ArrayList of integers using the Selection Sort algorithm.
 */
public class SelectionSorter {

    /**
     * Sorts the given ArrayList of integers in ascending order using the Selection Sort algorithm.
     *
     * @param list The ArrayList to be sorted.
     */
    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            swap(list, i, minIndex);
        }
    }

    /**
     * Swaps the elements at the given indices in the ArrayList.
     *
     * @param list The ArrayList in which to swap elements.
     * @param i    The index of the first element to swap.
     * @param j    The index of the second element to swap.
     */
    private static void swap(ArrayList<Integer> list, int i, int j) {
        ListHandler.swap(list, i, j);
    }

    public static void sort(int[] arr) { // O(n^2)
        for (int i = 0; i < arr.length; i++) {
             int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            swap(arr, minIdx, i);

            printArray(arr);
        }
    }

    private static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }

    public static void main(String[] args) {
        //                 m
        //           i           j
        //           0  1  2  3  4
        int[] arr = {5, 3, 0, 8, 1};
        SelectionSorter.sort(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
