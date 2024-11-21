package y3.s1.cse222.canvas.m05_elementary_sorts;

import java.util.ArrayList;
import java.util.List;

/**
 * Shell sort algorithm implementation for ArrayList.
 * <p>
 * Shell sort is a highly efficient sorting algorithm and is based on insertion sort algorithm.
 * It improves upon insertion sort by breaking the original list into a number of smaller sublists,
 * each of which is sorted using a modified insertion sort.
 * <p>
 * The key idea is to rearrange the elements by comparing them with elements that are far apart.
 * The distance between elements is called the 'gap'. Initially, the gap is set to a large value,
 * and then it is gradually reduced until it becomes 1.
 * <p>
 * The time complexity of Shell sort is O(n^(3/2)) in the worst case, but it performs well for
 * large datasets. It is an in-place sorting algorithm, meaning it does not require any additional
 * memory proportional to the input size.
 *
 * @author YourName
 * @version 1.0
 */
public class ShellSorter {

    /**
     * Sorts the given ArrayList using Shell sort algorithm.
     *
     * @param list The ArrayList to be sorted.
     */
    public static void sort(List<Integer> list) {
        int n = list.size();
        int gap = 1;

        // Calculate the initial gap value
        while (gap < n / 3) {
            gap = 3 * gap + 1;
        }

        while (gap >= 1) {
            // Perform a modified insertion sort for each gap
            for (int i = gap; i < n; i++) {
                int temp = list.get(i);
                int j = i;

                while (j >= gap && list.get(j - gap) > temp) {
                    list.set(j, list.get(j - gap));
                    j -= gap;
                }

                list.set(j, temp);
            }

            gap /= 3;
        }
    }
}