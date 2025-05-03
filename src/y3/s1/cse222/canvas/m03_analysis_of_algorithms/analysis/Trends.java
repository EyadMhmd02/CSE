package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.bonus.GlueList;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.list_handler.ListHandler;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms.BogoSorter;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.sorting_algorithms.MergeSorter;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.stopwatch.Stopwatch;

import java.math.BigInteger;

/**
 * The main class for demonstrating the time complexity of various algorithms.
 * It includes methods for adding two BigInteger numbers, performing binary
 * search,
 * finding the maximum number, sorting a list using merge sort, checking pairs
 * and triplets,
 * calculating Fibonacci numbers, and performing bogo sort.
 */
public class Trends {
    /**
     * The main method of the Trends class. It demonstrates the time complexity of
     * various algorithms.
     *
     * @param args Command line arguments (not used in this method).
     */
    public static void main(String[] args) {
        // generate an GlueList with maximum integer size possible, numbers in it are
        // randomly generated, with upper bound 20
        Stopwatch stopwatch = new Stopwatch();
        GlueList<Integer> list = ListHandler.createList();
        int size = ListHandler.MAX_SIZE;
        int bound = 20;
        ListHandler.populateListWithRandomNumbers(list, size, bound);
        int key = ListHandler.setKeyAtLast(list, 30);

        // Constant => O(1)
        long num = Long.MAX_VALUE;
        System.out.println("Constant\t\t=>\t\tO(1)");
        System.out.printf("Adding %,3d + %,3d...\n", num, num);
        stopwatch.reset();
        addTwoNumbers(BigInteger.valueOf(num), BigInteger.valueOf(num));
        System.out.println(stopwatch);

        // Logarithmic => O(log n)
        System.out.println("Logarithmic\t\t=>\t\tO(log n)");
        System.out.printf("Binary searching in a list of size %,3d...\n", size);
        stopwatch.reset();
        binarySearch(list, key, 0, list.size() - 1);
        System.out.println(stopwatch);

        // Linear => O(n)
        System.out.println("Linear\t\t\t=>\t\tO(n)");
        System.out.printf("Finding the maximum number in a list of size %,3d...\n", size);
        stopwatch.reset();
        findMaximumNumber(list);
        System.out.println(stopwatch);

        // Linearithmic => O(n log n)
        size /= 10;
        System.out.println("size /= 10");
        list = ListHandler.createList();
        ListHandler.populateListWithRandomNumbers(list, size, bound);
        System.out.println("Linearithmic\t=>\t\tO(n log n)");
        System.out.printf("Merge sorting a list of size %,3d...\n", size);
        stopwatch.reset();
        mergeSort(list);
        System.out.println(stopwatch);

        // Quadratic => O(n²)
        size /= 100;
        System.out.println("size /= 1000");
        list = ListHandler.createList();
        ListHandler.populateListWithRandomNumbers(list, size, bound);
        System.out.println("Quadratic\t\t=>\t\tO(n²)");
        System.out.printf("Checking all pairs in a list of size %,3d...\n", size);
        stopwatch.reset();
        checkAllPairs(list);
        System.out.println(stopwatch);

        // Cubic => O(n³)
        size = 9999;
        System.out.printf("size = %,3d\n", size);
        list = ListHandler.createList();
        ListHandler.populateListWithRandomNumbers(list, size, bound);
        System.out.println("Cubic\t\t\t=>\t\tO(n³)");
        System.out.printf("Checking all triplets in a list of size %,3d...\n", size);
        stopwatch.reset();
        checkAllTriplets(list);
        System.out.println(stopwatch);

        // Exponential => O(2ⁿ)
        int n = 60;
        System.out.println("Exponential\t\t=>\t\tO(2ⁿ)");
        System.out.println("Finding fibonacci sum of " + n + "...");
        stopwatch.reset();
        fibonacci(n);
        System.out.println(stopwatch);

        // Factorial => O(n!)
        n = 16;
        System.out.println("Factorial\t\t=>\t\tO(n!)");
        System.out.println("Running a function for " + n + "! times...");
        stopwatch.reset();
        factorialRuntimeFunction(n);
        System.out.println(stopwatch);

        // Bigger => O(n n!)
        list = ListHandler.createList();
        size = 14;
        ListHandler.populateListWithRandomNumbers(list, size, bound);
        System.out.println("Bigger\t\t\t=>\t\tO(n n!)");
        System.out.println("Actually it's unpredictable...");
        System.out.printf("Bogo sorting a list of size %,3d...\n", size);
        stopwatch.reset();
        bogoSort(list);
        System.out.println(stopwatch);

        size += 2;
        System.out.println("size += 2");
        list = ListHandler.createList();
        ListHandler.populateListWithRandomNumbers(list, size, bound);
        System.out.printf("Bogo sorting a list of size %,3d...\n", size);
        stopwatch.reset();
        bogoSort(list);
        System.out.println(stopwatch);

        size++;
        System.out.println("size++");
        list = ListHandler.createList();
        ListHandler.populateListWithRandomNumbers(list, size, bound);
        System.out.printf("Bogo sorting a list of size %,3d...\n", size);
        stopwatch.reset();
        bogoSort(list);
        System.out.println(stopwatch);
    }

    // Constant => O(1)

    /**
     * This function adds two BigInteger numbers together.
     *
     * @param n1 The first BigInteger number to add.
     * @param n2 The second BigInteger number to add.
     * @return The sum of the two input numbers.
     */
    private static BigInteger addTwoNumbers(BigInteger n1, BigInteger n2) {
        return n1.add(n2);
    }

    // Logarithmic => O(log n)

    /**
     * Performs a binary search on a sorted list of integers.
     *
     * @param list The sorted list of integers to search.
     * @param n    The integer to search for.
     * @param low  The lower index of the search range.
     * @param high The upper index of the search range.
     * @return The index of the first occurrence of the integer {@code n} in the
     *         list, or -1 if not found.
     * @throws IllegalArgumentException If the list is null or empty.
     * @throws IllegalArgumentException If the low index is less than 0 or greater
     *                                  than the high index.
     * @throws IllegalArgumentException If the high index is greater than the size
     *                                  of the list minus one.
     */
    private static int binarySearch(GlueList<Integer> list, int n, int low, int high) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("The list cannot be null or empty.");
        }
        if (low < 0 || low > high) {
            throw new IllegalArgumentException(
                    "The low index must be non-negative and less than or equal to the high index.");
        }
        if (high > list.size() - 1) {
            throw new IllegalArgumentException(
                    "The high index must be less than or equal to the size of the list minus one.");
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

    // Linear => O(n)

    /**
     * Finds the maximum number in a given list of integers.
     *
     * @param list The list of integers to find the maximum from.
     * @return The maximum number in the list.
     * @throws NullPointerException     If the given list is null.
     * @throws IllegalArgumentException If the given list is empty.
     */
    private static int findMaximumNumber(GlueList<Integer> list) {
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

    // Linearithmic => O(n log n)

    /**
     * Performs a merge sort on the given list of integers.
     * Merge sort is a divide-and-conquer algorithm that divides the list into two
     * halves,
     * sorts them separately, and then merges them back together.
     * The time complexity of merge sort is O(n log n), where n is the number of
     * elements in the list.
     *
     * @param list The list of integers to be sorted.
     */
    private static void mergeSort(GlueList<Integer> list) {
        MergeSorter.sort(list);
    }

    // Quadratic => O(n²)

    /**
     * This function checks all possible pairs of integers in the given list and
     * counts the number of pairs whose sum equals zero.
     *
     * @param list The list of integers to check pairs from.
     * @return The count of pairs whose sum equals zero.
     */
    private static int checkAllPairs(GlueList<Integer> list) {
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

    // Cubic => O(n³)

    /**
     * This function checks all possible triplets of integers in the given list and
     * counts the number of triplets whose sum equals zero.
     *
     * @param list The list of integers to check triplets from.
     * @return The count of triplets whose sum equals zero.
     */
    private static int checkAllTriplets(GlueList<Integer> list) {
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

    // Exponential => O(2ⁿ)

    /**
     * This function calculates the nth Fibonacci number using recursion.
     * The Fibonacci sequence is a series of numbers in which each number is the sum
     * of the two preceding ones,
     * usually starting with 0 and 1.
     *
     * @param n The position of the Fibonacci number to calculate.
     *          Must be a non-negative integer.
     * @return The nth Fibonacci number.
     * @throws IllegalArgumentException If n is a negative number.
     */
    private static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a non-negative integer.");
        }
        if (n <= 1)
            return n;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    // Factorial => O(n!)

    /**
     * This function calculates the factorial of a given number using recursion.
     * The factorial of a non-negative integer n is the product of all positive
     * integers less than or equal to n.
     * For example, the factorial of 5 (denoted as 5!) is 5 * 4 * 3 * 2 * 1 = 120.
     *
     * @param n The non-negative integer for which the factorial is to be
     *          calculated.
     * @return The factorial of the given number.
     */
    private static void factorialRuntimeFunction(int n) {
        for (int i = 0; i < n; i++) {
            factorialRuntimeFunction(n - 1);
        }
    }

    // Bigger => O(n n!)

    /**
     * Performs a bogo sort on the given list of integers.
     * Bogo sort is a highly inefficient sorting algorithm that randomly shuffles
     * elements until the list is sorted.
     * It is not suitable for large lists due to its high time complexity of O(n
     * n!).
     *
     * @param list The list of integers to be sorted.
     * @throws IllegalArgumentException If the input list is null.
     */
    private static void bogoSort(GlueList<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("Input list cannot be null.");
        }
        BogoSorter.sort(list);
    }
}

// SAMPLE OUTPUT
/*
Creating list...

Populating list of size 532,199,999...

Constant		=>		O(1)
Adding 9,223,372,036,854,775,807 + 9,223,372,036,854,775,807...
Elapsed time:	000:00:00:00:000:038200

Logarithmic		=>		O(log n)
Binary searching in a list of size 532,199,999...
Elapsed time:	000:00:00:00:000:031600

Linear			=>		O(n)
Finding the maximum number in a list of size 532,199,999...
Elapsed time:	000:00:00:12:475:664100

size /= 10
Creating list...

Populating list of size 53,219,999...

Linearithmic	=>		O(n log n)
Merge sorting a list of size 53,219,999...
Elapsed time:	000:00:00:57:449:820300

size /= 1000
Creating list...

Populating list of size 532,199...

Quadratic		=>		O(n²)
Checking all pairs in a list of size 532,199...
Elapsed time:	000:01:02:00:688:998100

size = 9,999
Creating list...

Populating list of size 9,999...

Cubic			=>		O(n³)
Checking all triplets in a list of size 9,999...
Elapsed time:	000:01:30:52:840:241400

Exponential		=>		O(2ⁿ)
Finding fibonacci sum of 60...
Elapsed time:	000:01:29:07:493:671500

Factorial => O(n!)
Running a function for 14! times...
Elapsed time: 000:00:09:07:436
Running a function for 16! times...
Elapsed time: 001:11:29:33:652

Creating list...

Populating list with size of 14...

Bigger => O(n n!)
Actually it's unpredictable...
Bogo sorting a list of size 14...
Elapsed time: 000:00:00:34:166
Elapsed time: 000:00:09:45:653
Elapsed time: 000:00:18:39:753
Elapsed time: 000:00:44:03:972

size += 2
Creating list...

Populating list with size of 16...

Bogo sorting a list of size 16...
Elapsed time: 000:08:27:49:323
Elapsed time: 000.11:03:37:135

size++
Creating list...

Populating list with size of 17...

Bogo sorting a list of size 17...
Elapsed time: 002:08:07:16:011
*/
