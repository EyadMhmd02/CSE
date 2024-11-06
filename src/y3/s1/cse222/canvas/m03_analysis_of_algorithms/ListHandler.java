package y3.s1.cse222.canvas.m03_analysis_of_algorithms;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Random;

class ListHandler {
    public static @NotNull ArrayList<Integer> createList() {
        System.out.println("Creating list...\n");
        return new ArrayList<>(); // n
    }

    public static void populateListWithRandomNumbers(ArrayList<Integer> list, int size) {
        System.out.println("Populating list with size of " + size + "...");
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(20));
        }
    }

    public static int setKey(ArrayList<Integer> list) {
        list.set(list.size() - 1, 30);
        return 30;
    }
}
