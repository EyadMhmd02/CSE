package y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.list_handler;

import org.jetbrains.annotations.NotNull;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.bonus.GlueList;

import java.util.Collections;
import java.util.Random;

public class ListHandler {
    public final static int MAX_SIZE = 532199999;

    /**
     * Creates a new ArrayList of integers.
     *
     * @return A new ArrayList of integers.
     */
    public static @NotNull GlueList<Integer> createList() {
        System.out.println("Creating list...\n");
        return new GlueList<>(); // n
    }

    /**
     * Populates the given list with random integers.
     *
     * @param list  The list to be populated.
     * @param size  The number of random integers to generate.
     * @param bound The upper bound (exclusive) for the random integers.
     */
    public static void populateListWithRandomNumbers(GlueList<Integer> list, int size, int bound) {
        System.out.printf("Populating list of size %,3d...\n", size);
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(bound));
        }
    }

    /**
     * Sets the value of the last element in the list to the given key.
     *
     * @param list The list in which to set the value.
     * @param key  The value to set.
     * @return The key that was set.
     */
    public static int setKeyAtLast(GlueList<Integer> list, int key) {
        list.set(list.size() - 1, key);
        return key;
    }

    /**
     * Checks if the given list of integers is sorted in ascending order.
     *
     * @param list The list of integers to be checked.
     * @return {@code true} if the list is sorted in ascending order, {@code false} otherwise.
     */
    public static boolean isSorted(GlueList<Integer> list) {
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
    public static void swap(GlueList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    /**
     * Shuffles the elements in the given list.
     *
     * @param list The list to be shuffled.
     */
    public static void shuffle(GlueList<Integer> list) {
        System.out.println("Shuffling list...");
        System.out.println();
        Collections.shuffle(list);
    }
}