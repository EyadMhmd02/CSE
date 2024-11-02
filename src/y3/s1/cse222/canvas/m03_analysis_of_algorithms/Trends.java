package y3.s1.cse222.canvas.m03_analysis_of_algorithms;

import java.util.ArrayList;

public class Trends {
    public static void main(String[] args) {
        // generate an ArrayList with maximum integer size possible, number in it are randomly generated, with upper bound 20
        ArrayList<Integer> list = ListHandler.createList();
        int size = Integer.MAX_VALUE / 5;
        ListHandler.populateListWithRandomNumbers(list, size);
        ListHandler.getKey(list);

        // Constant         =>      O(1)
        Stopwatch stopwatch = new Stopwatch();
        System.out.println("Constant\t\t=>\t\tO(1)");
        System.out.println("Adding two numbers...");
        addTwoNumbers(list.get(4), list.get(5));
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
        MergeSorter.mergeSort(list);
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
        size = Integer.MAX_VALUE / 100000;
        ListHandler.populateListWithRandomNumbers(list, size);
        System.out.println("Cubic\t\t\t=>\t\tO(n^3)");
        System.out.println("Checking all triplets in a list of size " + size + "...");
        checkAllTriplets(list);
        System.out.println(stopwatch);

        // Exponential      =>      O(2^n)
        stopwatch = new Stopwatch();
        int n = 50;
        System.out.println("Exponential\t\t=>\t\tO(2^n)");
        System.out.println("Finding fibonacci sum of " + n + "...");
        fibonacci(50);
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
        System.out.println("Bogo sorting a list of size " + size +"...");
        BogoSorter.bogoSort(list);
        System.out.println(stopwatch);
    }

    // Constant         =>      O(1)
    private static int addTwoNumbers(int n1, int n2) {
        return n1 + n2;
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
    // Merge sort


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
    // Bogo sort
}
