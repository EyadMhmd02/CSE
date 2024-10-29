package y1.s2.Sections.SortingAlgorithms.merge_sort;

/**
 * Merge sort is one of the most flexible sorting algorithms in java known to mankind (yes, no kidding). It uses the divide and conquers strategy for sorting elements in an array. It is also a stable sort, meaning that it will not change the order of the original elements in an array concerning each other. The underlying strategy breaks up the array into multiple smaller segments till segments of only two elements (or one element) are obtained. Now, elements in these segments are sorted and the segments are merged to form larger segments. This process continues till the entire array is sorted.
 * <p>
 * This algorithm has two main parts:
 * <p>
 * • mergeSort() – This function calculates the middle index for the subarray and then partitions the subarray into two halves. The first half runs from index left to middle, while the second half runs from index middle+1 to right. After the partitioning is done, this function automatically calls the merge() function for sorting the subarray being handled by the mergeSort() call.
 * <p>
 * • merge() – This function does the actual heavy lifting for the sorting process. It requires the input of four parameters – the array, the starting index (left), the middle index (middle), and the ending index (right). Once received, merge() will split the subarray into two subarrays – one left subarray and one right subarray. The left subarray runs from index left to middle, while the right subarray runs from index middle+1 to right. This function then merges the two subarrays to get the sorted subarray.
 */

public class MergeSort {
    void merge(int[] arr, int left, int middle, int right) {
        int low = middle - left + 1; //size of the left subarray
        int high = right - middle; //size of the right subarray
        int L[] = new int[low]; //create the left and right subarray
        int R[] = new int[high];
        int i = 0, j = 0;
        for (i = 0; i < low; i++) //copy elements into left subarray
        {
            L[i] = arr[left + i];
        }
        for (j = 0; j < high; j++) //copy elements into right subarray
        {
            R[j] = arr[middle + 1 + j];
        }
        int k = left; //get starting index for sort
        i = 0; //reset loop variables before performing merge
        j = 0;
        while (i < low && j < high) //merge the left and right subarrays
        {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < low) //merge the remaining elements from the left subarray
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < high) //merge the remaining elements from right subarray
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void mergeSort(int[] arr, int left, int right) //helper function that creates the sub cases for sorting
    {
        int middle;
        if (left < right) { //sort only if the left index is lesser than the right index (meaning that sorting is done)
            middle = (left + right) / 2;
            mergeSort(arr, left, middle); //left subarray
            mergeSort(arr, middle + 1, right); //right subarray
            merge(arr, left, middle, right); //merge the two subarrays
        }
    }

    void display(int[] arr) //display the array
    {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 3, 1, 5, 13, 12};
        MergeSort ob = new MergeSort();
        ob.mergeSort(arr, 0, arr.length - 1);
        ob.display(arr);
    }
}
