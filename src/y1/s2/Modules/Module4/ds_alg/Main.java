package y1.s2.Modules.Module4.ds_alg;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        System.out.println("creating list...");
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>(); // n

        System.out.println("populating list...");
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < Integer.MAX_VALUE / 5; i++) {
            list.add(random.nextInt(20));
        }
        list.set(list.size() - 1, 30);

        int key = 30;

        System.out.println("searching for " + key + "...");
        System.out.println();
        Instant start = Instant.now();
//        System.out.println(linearSearch(list, key)); // O(n)
        System.out.println(binarySearch(list, key, 0, list.size() - 1)); // O(log n)
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: " + timeElapsed.toSeconds() + " seconds");
    }

    // O(n)
    public static int linearSearch(ArrayList<Integer> list, int n) {
        for (int i = 0; i < list.size(); i++) {
            if (n == list.get(i)) {
                return i;
            }
        }
        return -1;
    }

    // O(log n)
    public static int binarySearch(ArrayList<Integer> list, int n, int low, int high) {
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
}