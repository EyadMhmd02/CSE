package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.list_handler;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ListHandler {
    public static @NotNull ArrayList<Integer> createList() {
        System.out.println("Creating list...\n");
        return new ArrayList<>(); // n
    }

    public static void populateListWithRandomNumbers(ArrayList<Integer> list, int size, int bound) {
        System.out.println("Populating list with size of " + size + "...");
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(bound));
        }
    }

    public static int setKeyAtLast(ArrayList<Integer> list, int key) {
        list.set(list.size() - 1, key);
        return key;
    }

    /**
     * Checks if the given list of integers is sorted in ascending order.
     *
     * @param list The list of integers to be checked.
     * @return {@code true} if the list is sorted in ascending order, {@code false} otherwise.
     */
    public static boolean isSorted(ArrayList<Integer> list) {
        if (list == null) return true;

        if (list.size() <= 1) {
            return true;
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Swaps the elements at the given indices in the ArrayList.
     *
     * @param list The ArrayList in which to swap elements.
     * @param i    The index of the first element to swap.
     * @param j    The index of the second element to swap.
     */
    public static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void shuffle(ArrayList<Integer> list) {
        System.out.println("Shuffling list...");
        System.out.println();
        Collections.shuffle(list);
    }
}
