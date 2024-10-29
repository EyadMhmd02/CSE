package y1.s2.Sections.SortingAlgorithms.insertion_sort;

/**
 * If you’re quite done with more complex sorting algorithms and want to move on to something simpler: insertion sort is the way to go. While it isn’t a much-optimized algorithm for sorting an array, it is one of the more easily understood ones. Implementation is pretty easy too. In insertion sort, one picks up an element and considers it to be the key. If the key is smaller than its predecessor, it is shifted to its correct location in the array.
 * <p>
 * <p>
 * Algorithm:
 * <p>
 * 1. START
 * <p>
 * 2. Repeat steps 2 to 4 till the array end is reached.
 * <p>
 * 3. Compare the element at current index i with its predecessor. If it is smaller, repeat step 3.
 * <p>
 * 4. Keep shifting elements from the “sorted” section of the array till the correct location of the key is found.
 * <p>
 * 5. Increment loop variable.
 * <p>
 * 6. END
 */

public class InsertionSort {
    static void insertionSort(int[] arr, int n) {
        if (n <= 1) { // passes are done
            return;
        }
        insertionSort(arr, n - 1); // one element sorted, sort the remaining array

        int last = arr[n - 1]; // last element of the array
        int j = n - 2; // correct index of the array's last element

        while (j >= 0 && arr[j] > last) { // find the correct index of the last element
            arr[j + 1] = arr[j]; // shift section of sorted elements upwards by one element if correct index isn't found
            j--;
        }
        arr[j + 1] = last; // set the last element at its correct index
    }

    void display(int[] arr) { // display the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {22, 21, 11, 15, 16};

        insertionSort(arr, arr.length);
        InsertionSort ob = new InsertionSort();
        ob.display(arr);
    }
}
