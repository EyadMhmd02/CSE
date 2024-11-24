package y3.s1.cse222.canvas.m05_elementary_sorts;

import java.util.ArrayList;

/**
 * This class provides a static method for sorting an ArrayList of integers using the Insertion Sort algorithm.
 */
public class InsertionSorter {

    /**
     * Sorts the given ArrayList of integers in ascending order using the Insertion Sort algorithm.
     *
     * @param list The ArrayList to be sorted.
     * @throws NullPointerException If the given list is null.
     */
    public static void sort(ArrayList<Integer> list) {
        if (list == null) {
            throw new NullPointerException("The given list is null.");
        }

        for (int i = 1; i < list.size(); i++) {
            int key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
    }

    public static void sort(int[] arr) { // O(n^2)
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] < arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    private static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }

    public static void main(String[] args) {
        //           j  i
        //           0  1  2  3  4
        int[] arr = {5, 3, 0, 8, 1};
        InsertionSorter.sort(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
