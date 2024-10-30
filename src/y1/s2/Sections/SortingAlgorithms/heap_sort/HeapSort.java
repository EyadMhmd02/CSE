package y1.s2.Sections.SortingAlgorithms.heap_sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Heap sort is one of the most important sorting methods in java that one needs to learn to get into sorting. It combines the concepts of a tree as well as sorting, properly reinforcing the use of concepts from both. A heap is a complete binary search tree where items are stored in a special order depending on the requirement. A min-heap contains the minimum element at the root, and every child of the root must be greater than the root itself. The children at the level after that must be greater than these children, and so on. Similarly, a max-heap contains the maximum element at the root. For the sorting process, the heap is stored as an array where for every parent node at the index i, the left child is at index 2 * i + 1, and the right child is at index 2 * i + 2.
 * <p>
 * A max heap is built with the elements of the unsorted array, and then the maximum element is extracted from the root of the array and then exchanged with the last element of the array. Once done, the max heap is rebuilt for getting the next maximum element. This process continues till there is only one node present in the heap.
 * <p>
 * This algorithm has two main parts:-
 * <p>
 *  heapSort() – This function helps construct the max heap initially for use. Once done, every root element is extracted and sent to the end of the array. Once done, the max heap is reconstructed from the root. The root is again extracted and sent to the end of the array, and hence the process continues.
 * <p>
 *  heapify() – This function is the building block of the heap sort algorithm. This function determines the maximum from the element being examined as the root and its two children. If the maximum is among the children of the root, the root and its child are swapped. This process is then repeated for the new root. When the maximum element in the array is found (such that its children are smaller than it) the function stops. For the node at index i, the left child is at index 2 * i + 1, and the right child is at index 2 * i + 1. (indexing in an array starts from 0, so the root is at 0).
 */

public class HeapSort {
    public static void heapSort(ArrayList<Integer> list) {
        int temp;
        for (int i = list.size() / 2 - 1; i >= 0; i--) //build the heap
        {
            heapify(list, list.size(), i);
        }
        for (int i = list.size() - 1; i > 0; i--) //extract elements from the heap
        {
            temp = list.get(0); //move current root to end (since it is the largest)
            list.set(0, list.get(i));
            list.set(i, temp);
            heapify(list, i, 0); //recall heapify to rebuild heap for the remaining elements
        }
    }

    static void heapify(ArrayList<Integer> list, int n, int i) {
        int MAX = i; // Initialize largest as root
        int left = 2 * i + 1; //index of the left child of ith node = 2*i + 1
        int right = 2 * i + 2; //index of the right child of ith node = 2*i + 2
        int temp;
        if (left < n && list.get(left) > list.get(MAX)) //check if the left child of the root is larger than the root
        {
            MAX = left;
        }
        if (right < n && list.get(right) > list.get(MAX)) //check if the right child of the root is larger than the root
        {
            MAX = right;
        }
        if (MAX != i) { //repeat the procedure for finding the largest element in the heap
            temp = list.get(i);
            list.set(i, list.get(MAX));
            list.set(MAX, temp);
            heapify(list, n, MAX);
        }
    }

    static void display(ArrayList<Integer> list) //display the array
    {
        for (int j : list) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 12, 9, 3, 10, 15));
        heapSort(list);
        display(list);
    }
}
