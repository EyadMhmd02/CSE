package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.list_handler.ListHandler;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms.BogoSorter;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms.MergeSorter;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.stopwatch.Stopwatch;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Trends {
    /**
     * The main method of the Trends class. It demonstrates the time complexity of various algorithms.
     *
     * @param args Command line arguments (not used in this method).
     */
    public static void main(String[] args) {
        // generate an ArrayList with maximum integer size possible, numbers in it are randomly generated, with upper bound 20
        ArrayList<Integer> list = ListHandler.createList();
        int size = Integer.MAX_VALUE / 10;
        int bound = 20;
        ListHandler.populateListWithRandomNumbers(list, size, bound);
        int key = ListHandler.setKeyAtLast(list, 30);

        // Constant         =>      O(1)
        System.out.println("Constant\t\t=>\t\tO(1)");
        System.out.println("Adding two very large numbers...");
        Stopwatch stopwatch = new Stopwatch();
        addTwoNumbers(BigInteger.valueOf(Long.MAX_VALUE), BigInteger.valueOf(Long.MAX_VALUE));
        System.out.println(stopwatch);

        // Logarithmic      =>      O(log n)
        System.out.println("Sorting the list to be prepared for binary search...\n");
        Collections.sort(list);
        System.out.println("Logarithmic\t\t=>\t\tO(log n)");
        System.out.println("Binary searching in a list of size " + size + "...");
        stopwatch.reset();
        binarySearch(list, key, 0, list.size() - 1);
        System.out.println(stopwatch);

        // Linear           =>      O(n)
        System.out.println("Linear\t\t\t=>\t\tO(n)");
        System.out.println("Finding the maximum number in a list of size " + size + "...");
        stopwatch.reset();
        findMaximumNumber(list);
        System.out.println(stopwatch);

        // Linearithmic     =>      O(n log n)
        list = ListHandler.createList();
        size = Integer.MAX_VALUE / 100;
        ListHandler.populateListWithRandomNumbers(list, size, bound);
        System.out.println("Linearithmic\t=>\t\tO(n log n)");
        System.out.println("Merge sorting a list of size " + size + "...");
        stopwatch.reset();
        mergeSort(list);
        System.out.println(stopwatch);

        // Quadratic        =>      O(n^2)
        list = ListHandler.createList();
        size = Integer.MAX_VALUE / 10000;
        ListHandler.populateListWithRandomNumbers(list, size, bound);
        System.out.println("Quadratic\t\t=>\t\tO(n^2)");
        System.out.println("Checking all pairs in a list of size " + size + "...");
        stopwatch.reset();
        checkAllPairs(list);
        System.out.println(stopwatch);

        // Cubic            =>      O(n^3)
        list = ListHandler.createList();
//    size = Integer.MAX_VALUE / 100000;
        size = 5000;
        ListHandler.populateListWithRandomNumbers(list, size, bound);
        System.out.println("Cubic\t\t\t=>\t\tO(n^3)");
        System.out.println("Checking all triplets in a list of size " + size + "...");
        stopwatch.reset();
        checkAllTriplets(list);
        System.out.println(stopwatch);

        // Exponential      =>      O(2^n)
        int n = 52;
        System.out.println("Exponential\t\t=>\t\tO(2^n)");
        System.out.println("Finding fibonacci sum of " + n + "...");
        stopwatch.reset();
        fibonacci(n);
        System.out.println(stopwatch);

        // Factorial        =>      O(n!)
        n = 14;
        System.out.println("Factorial\t\t=>\t\tO(n!)");
        System.out.println("Running a function for " + n + "! times...");
        stopwatch.reset();
        factorialRuntimeFunction(n);
        System.out.println(stopwatch);

        // Bigger           =>      O(n n!)
        list = ListHandler.createList();
        size = 14;
        ListHandler.populateListWithRandomNumbers(list, size, bound);
        System.out.println("Bigger\t\t\t=>\t\tO(n n!)");
        System.out.println("Bogo sorting a list of size " + size + "...");
        stopwatch.reset();
        bogoSort(list);
        System.out.println("Actually it's unpredictable...");
        System.out.println(stopwatch);
    }

    // Constant         =>      O(1)

    /**
     * This function adds two BigInteger numbers together.
     *
     * @param n1 The first BigInteger number to add.
     * @param n2 The second BigInteger number to add.
     *
     * @return The sum of the two input numbers.
     */
    private static BigInteger addTwoNumbers(BigInteger n1, BigInteger n2) {
        return n1.add(n2);
    }
    // Logarithmic      =>      O(log n)

    /**
     * Performs a binary search on a sorted list of integers.
     *
     * @param list The sorted list of integers to search.
     * @param n The integer to search for.
     * @param low The lower index of the search range.
     * @param high The upper index of the search range.
     *
     * @return The index of the first occurrence of the integer {@code n} in the list, or -1 if not found.
     *
     * @throws IllegalArgumentException if the list is null or empty.
     * @throws IllegalArgumentException if the low index is less than 0 or greater than the high index.
     * @throws IllegalArgumentException if the high index is greater than the size of the list minus one.
     */
    private static int binarySearch(ArrayList<Integer> list, int n, int low, int high) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("The list cannot be null or empty.");
        }
        if (low < 0 || low > high) {
            throw new IllegalArgumentException("The low index must be non-negative and less than or equal to the high index.");
        }
        if (high > list.size() - 1) {
            throw new IllegalArgumentException("The high index must be less than or equal to the size of the list minus one.");
        }

        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (n == list.get(mid)) {
            return mid;
        } else if (n > list.get(mid)) {
            return binarySearch(list, n, mid + 1, high);
        } else {
            return binarySearch(list, n, low, mid - 1);
        }
    }

    // Linear           =>      O(n)

    /**
     * Finds the maximum number in a given list of integers.
     *
     * @param list The list of integers to find the maximum from.
     * @return The maximum number in the list.
     *
     * @throws NullPointerException If the given list is null.
     * @throws IllegalArgumentException If the given list is empty.
     */
    private static int findMaximumNumber(ArrayList<Integer> list) {
        if (list == null) {
            throw new NullPointerException("The given list is null.");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("The given list is empty.");
        }

        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    // Linearithmic     =>      O(n log n)

    /**
     * Performs a merge sort on the given list of integers.
     * Merge sort is a divide-and-conquer algorithm that divides the list into two halves,
     * sorts them separately, and then merges them back together.
     * The time complexity of merge sort is O(n log n), where n is the number of elements in the list.
     *
     * @param list The list of integers to be sorted.
     */
    private static void mergeSort(ArrayList<Integer> list) {
        MergeSorter.sort(list);
    }


    // Quadratic        =>      O(n^2)

    /**
     * This function checks all possible pairs of integers in the given list and counts the number of pairs whose sum equals zero.
     *
     * @param list The list of integers to check pairs from.
     * @return The count of pairs whose sum equals zero.
     */
    private static int checkAllPairs(ArrayList<Integer> list) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    // Cubic            =>      O(n^3)

    /**
     * This function checks all possible triplets in the given list and counts the number of triplets whose sum equals zero.
     *
     * @param list The list of integers to check for triplets.
     * @return The count of triplets whose sum equals zero.
     */
    private static int checkAllTriplets(ArrayList<Integer> list) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                for (int k = j + 1; k < list.size(); k++) {
                    if (list.get(i) + list.get(j) + list.get(k) == 0) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    // Exponential      =>      O(2^n)

    /**
     * This function calculates the nth Fibonacci number using recursion.
     * The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones,
     * usually starting with 0 and 1.
     *
     * @param n The position of the Fibonacci number to calculate.
     *          Must be a non-negative integer.
     *
     * @return The nth Fibonacci number.
     *         If n is less than or equal to 1, the function returns n.
     *         Otherwise, the function returns the sum of the (n-2)th and (n-1)th Fibonacci numbers.
     *
     * @throws IllegalArgumentException If n is a negative number.
     */
    private static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a non-negative integer");
        }
        if (n <= 1) return n;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }


    static void towerOfHanoi(int n, char from_rod,
                             char to_rod, char aux_rod) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod "
                + from_rod + " to rod "
                + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    // Factorial        =>      O(n!)

    /**
     * This function calculates the factorial of a given number using recursion.
     * The factorial of a non-negative integer n is the product of all positive integers less than or equal to n.
     * For example, the factorial of 5 (denoted as 5!) is 5 * 4 * 3 * 2 * 1 = 120.
     *
     * @param n The non-negative integer for which the factorial is to be calculated.
     * @return The factorial of the given number.
     *
     * Note: This function has a time complexity of O(n!), which means it will take an exponential amount of time to compute
     * the factorial of large numbers.
     */
    private static void factorialRuntimeFunction(int n) {
        for (int i = 0; i < n; i++) {
            factorialRuntimeFunction(n - 1);
        }
    }

    // Bigger           =>      O(n n!)

    /**
     * Performs a bogo sort on the given list of integers.
     * Bogo sort is a highly inefficient sorting algorithm that randomly shuffles elements until the list is sorted.
     * It is not suitable for large lists due to its high time complexity of O(n n!).
     *
     * @param list The list of integers to be sorted.
     * @throws IllegalArgumentException If the input list is null.
     */
    private static void bogoSort(ArrayList<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("Input list cannot be null");
        }
        BogoSorter.sort(list);
    }
}

// SAMPLE OUTPUT
/*
Creating list...

Populating list with size of 429496729...

Constant		=>		O(1)
Adding two very large numbers...
Elapsed time:	000:00:00:00:009

Logarithmic		=>		O(log n)
Binary searching in a list of size 429496729...
Elapsed time:	000:00:00:00:000

Linear			=>		O(n)
Finding the maximum number in a list of size 429496729...
Elapsed time:	000:00:00:00:890

Creating list...

Populating list with size of 21474836...

Linearithmic	=>		O(n log n)
Merge sorting a list of size 21474836...
Elapsed time:	000:00:00:16:531

Creating list...

Populating list with size of 214748...

Quadratic		=>		O(n^2)
Checking all pairs in a list of size 214748...
Elapsed time:	000:00:01:29:033

Creating list...

Populating list with size of 5000...

Cubic			=>		O(n^3)
Checking all triplets in a list of size 5000...
Elapsed time:	000:00:01:51:059

Exponential		=>		O(2^n)
Finding fibonacci sum of 52...
Elapsed time:	000:00:03:28:772

Factorial		=>		O(n!)
Running a function for 14! times...
Elapsed time:	000:00:09:07:436

Creating list...

Populating list with size of 14...

Bigger			=>		O(n n!)
Bogo sorting a list of size 14...
Actually it's unpredictable...
Elapsed time:	000:00:00:34:166
Elapsed time:	000:00:09:45:653
Elapsed time:	000:00:18:39:753
Elapsed time:	000:00:44:03:972

*/
