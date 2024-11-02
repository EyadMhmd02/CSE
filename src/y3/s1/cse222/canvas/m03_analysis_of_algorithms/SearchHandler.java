package y3.s1.cse222.canvas.m03_analysis_of_algorithms;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

class SearchHandler {
    private static int search(int key, ArrayList<Integer> list) {
        return linearSearch(list, key); // O(n)
//        return binarySearch(list, key, 0, list.size() - 1); // O(log n)
    }

    // O(n)
    private static int linearSearch(ArrayList<Integer> list, int n) {
        for (int i = 0; i < list.size(); i++) {
            if (n == list.get(i)) {
                return i;
            }
        }
        return -1;
    }

    // O(log n)
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

    public static void printSearchResult(int key, ArrayList<Integer> list) {
        System.out.println("Searching for " + key + " in an array of size " + list.size() + "...\n");

        Stopwatch stopwatch = new Stopwatch();

        int keyIndex = search(key, list);

        System.out.println(keyIndex == -1 ? "Not found" : "Found at index: " + keyIndex);

        System.out.println(stopwatch);
    }
}
