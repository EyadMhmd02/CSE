package y1.s2.Modules.Module4.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(0, 1, 4, 3, 5, 9, 8, 7, 2, 6));

        System.out.print("List: ");
        for (Integer n : list) {
            System.out.print(n + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Search for: ");
        int count = 0;
        while (count <= 100) {
            int key = scanner.nextInt();
            int index = linearSearch(list, key);
            if (index != -1) {
                System.out.println(key + " is found at index " + index);
            } else {
                System.out.println("couldn't find " + key + " in this list");
            }
            count++;
        }
    }

    // O(n)
    public static int linearSearch(ArrayList<Integer> list, int key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                return i;
            }
        }
        return -1; // Not found
    }
}
