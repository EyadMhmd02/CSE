package y1.s2.Modules.Module4.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(0, 1, 4, 3, 5, 9, 8, 7, 2, 6));
        Collections.sort(list);

        System.out.print("Sorted list: ");
        for (Integer n : list) {
            System.out.print(n + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Search for: ");
        int count = 0;
        while (count <= 100) {
            int key = scanner.nextInt();
            int index = recursiveBinarySearch(list, key, 0, list.size() - 1);
            if (index != -1) {
                System.out.println(key + " is found at index " + index);
            } else {
                System.out.println("couldn't find " + key + " in this list");
            }
            count++;
        }
    }

    public static int binarySearch(ArrayList<Integer> list, int key) {
        int low = 0, high = list.size() - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            // Found key. Return the index which is the value of middle.
            if (key == list.get(middle)) {
                return middle;
                // key is in the bottom half of the list. Move high down.
            } else if (key < list.get(middle)) {
                high = middle - 1;
                // key is in the top half of the list. Move low up.
            } else {
                low = middle + 1;
            }
        }
        return -1; // Not found
    }

    // O(lg n)
    public static int recursiveBinarySearch(ArrayList<Integer> list, int key, int low, int high) {
        // Base case. When low is greater than high, we essentially have an empty
        // list, and key cannot be in an empty list so we return -1 (not found).
        if (low > high) {
            return -1;
        }
        int middle = (low + high) / 2;
        if (key == list.get(middle)) {
            return middle;
        } else if (key < list.get(middle)) {
            return recursiveBinarySearch(list, key, low, middle - 1);
        } else {
            return recursiveBinarySearch(list, key, middle + 1, high);
        }
    }
}
