package y3.s1.cse222.canvas.m03_analysis_of_algorithms;

import java.math.BigInteger;
import java.util.ArrayList;

public class Trends {
    public static void main(String[] args) {
        // generate an ArrayList with maximum integer size possible, numbers in it are randomly generated, with upper bound 20
        ArrayList<Integer> list = ListHandler.createList();
        int size = Integer.MAX_VALUE / 5;
        ListHandler.populateListWithRandomNumbers(list, size);
        ListHandler.getKey(list);

        // Constant         =>      O(1)
        Stopwatch stopwatch = new Stopwatch();
        System.out.println("Constant\t\t=>\t\tO(1)");
        System.out.println("Adding two very large numbers...");
        addTwoNumbers(BigInteger.valueOf(Long.MAX_VALUE), BigInteger.valueOf(Long.MAX_VALUE));
        System.out.println(stopwatch);

        // Logarithmic      =>      O(log n)
        stopwatch = new Stopwatch();
        System.out.println("Logarithmic\t\t=>\t\tO(log n)");
        System.out.println("Binary searching in a list of size " + size + "...");
        binarySearch(list, 30, 0, list.size() - 1);
        System.out.println(stopwatch);

        // Linear           =>      O(n)
        stopwatch = new Stopwatch();
        System.out.println("Linear\t\t\t=>\t\tO(n)");
        System.out.println("Finding the maximum number in a list of size " + size + "...");
        findMaximumNumber(list);
        System.out.println(stopwatch);

        // Linearithmic     =>      O(n log n)
        stopwatch = new Stopwatch();
        list = ListHandler.createList();
        size = Integer.MAX_VALUE / 100;
        ListHandler.populateListWithRandomNumbers(list, size);
        System.out.println("Linearithmic\t=>\t\tO(n log n)");
        System.out.println("Merge sorting a list of size " + size + "...");
        mergeSort(list);
        System.out.println(stopwatch);

        // Quadratic        =>      O(n^2)
        stopwatch = new Stopwatch();
        list = ListHandler.createList();
        size = Integer.MAX_VALUE / 10000;
        ListHandler.populateListWithRandomNumbers(list, size);
        System.out.println("Quadratic\t\t=>\t\tO(n^2)");
        System.out.println("Checking all pairs in a list of size " + size + "...");
        checkAllPairs(list);
        System.out.println(stopwatch);

        // Cubic            =>      O(n^3)
        stopwatch = new Stopwatch();
        list = ListHandler.createList();
//        size = Integer.MAX_VALUE / 100000;
        size = 5000;
        ListHandler.populateListWithRandomNumbers(list, size);
        System.out.println("Cubic\t\t\t=>\t\tO(n^3)");
        System.out.println("Checking all triplets in a list of size " + size + "...");
        checkAllTriplets(list);
        System.out.println(stopwatch);

        // Exponential      =>      O(2^n)
        stopwatch = new Stopwatch();
        int n = 52;
        System.out.println("Exponential\t\t=>\t\tO(2^n)");
        System.out.println("Finding fibonacci sum of " + n + "...");
        fibonacci(n);
        System.out.println(stopwatch);

        // Factorial        =>      O(n!)
        stopwatch = new Stopwatch();
        n = 14;
        System.out.println("Factorial\t\t=>\t\tO(n!)");
        System.out.println("Running a function for " + n + "! times...");
        factorialRuntimeFunction(n);
        System.out.println(stopwatch);

        // Bigger           =>      O(n n!)
        stopwatch = new Stopwatch();
        list = ListHandler.createList();
        size = 14;
        ListHandler.populateListWithRandomNumbers(list, size);
        System.out.println("Bigger\t\t\t=>\t\tO(n n!)");
        System.out.println("Bogo sorting a list of size " + size + "...");
        bogoSort(list);
        System.out.println(stopwatch);
    }

    // Constant         =>      O(1)
    private static BigInteger addTwoNumbers(BigInteger n1, BigInteger n2) {
        return n1.add(n2);
    }

    // Logarithmic      =>      O(log n)
    private static int binarySearch(ArrayList<Integer> list, int n, int low, int high) {
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
    private static int findMaximumNumber(ArrayList<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    // Linearithmic     =>      O(n log n)
    private static void mergeSort(ArrayList<Integer> list) {
        MergeSorter.mergeSort(list);
    }


    // Quadratic        =>      O(n^2)
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
    private static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    // Factorial        =>      O(n!)
    private static void factorialRuntimeFunction(int n) {
        for (int i = 0; i < n; i++) {
            factorialRuntimeFunction(n - 1);
        }
    }

    // Bigger           =>      O(n n!)
    private static void bogoSort(ArrayList<Integer> list) {
        BogoSorter.bogoSort(list);
    }
}

/*
SAMPLE OUTPUT:

Creating list...

Populating list with size of 429496729...

Constant		=>		O(1)
Adding two very large numbers...
Elapsed time: 1.0 ms => 0.001 s => 0 m => 0 h

Logarithmic		=>		O(log n)
Binary searching in a list of size 429496729...
Elapsed time: 1.0 ms => 0.001 s => 0 m => 0 h

Linear			=>		O(n)
Finding the maximum number in a list of size 429496729...
Elapsed time: 913.0 ms => 0.913 s => 0 m => 0 h

Creating list...

Populating list with size of 21474836...

Linearithmic	=>		O(n log n)
Merge sorting a list of size 21474836...
Elapsed time: 22206.0 ms => 22.206 s => 0 m => 0 h

Creating list...

Populating list with size of 214748...

Quadratic		=>		O(n^2)
Checking all pairs in a list of size 214748...
Elapsed time: 84861.0 ms => 84.861 s => 1 m => 0 h

Creating list...

Populating list with size of 5000...

Cubic			=>		O(n^3)
Checking all triplets in a list of size 5000...
Elapsed time: 105098.0 ms => 105.098 s => 2 m => 0 h

Exponential		=>		O(2^n)
Finding fibonacci sum of 52...
Elapsed time: 196852.0 ms => 196.852 s => 3 m => 0 h

Factorial		=>		O(n!)
Running a function for 14! times...
Elapsed time: 545232.0 ms => 545.232 s => 9 m => 0 h

Creating list...

Populating list with size of 14...

Bigger			=>		O(n n!)
Bogo sorting a list of size 14...
Actually it's unpredictable
Elapsed time: 60835.0 ms => 60.835 s => 1 m => 0 h
Elapsed time: 4702063.0 ms => 4702.063 s => 78 m => 1 h
*/
