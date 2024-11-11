package y3.s1.cse222.canvas.m03_analysis_of_algorithms.hw2b;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CompletedOrderedList testing area.
 *
 * @author Eyad Mohamed AbdelMohsen Ghanem
 * @version (version)
 */

class Driver {
    public static void main(String[] args) {
        //ListADT<Integer> list = new CompletedList<>(); //simpler version
        OrderedListADT<Integer> list = new CompletedOrderedList<>();

        //RA: These are _extremely_ simple tests! You will need to write more!

        addRandomElements(list);

        System.out.println(list);

        list.remove(7);
        list.removeFirst();
        list.remove(17);
        list.removeLast();
        list.remove(14);
        list.removeLast();

        System.out.println(list);

        /* Test Results:
            1 3 7 9 13 14 16 17 23 24
            3 9 13 16
        */

        Iterator<Integer> iter = list.iterator();
        System.out.print("Iteration result: ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            if (iter.hasNext())
                System.out.print(" ");
        }
        System.out.println();

        list = new CompletedOrderedList<>();

        // Add elements to the list
        addRandomElements(list);

        // Create an ExecutorService to run multiple threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Define a Runnable task that modifies the list
        OrderedListADT<Integer> finalList = list;
        Runnable modifyTask = () -> {
            finalList.removeFirst();
            finalList.removeLast();
        };

        // Submit the modifyTask to the executor
        executor.submit(modifyTask);

        // Iterate over the list while another thread is modifying it
        iter = list.iterator();
        try {
            while (iter.hasNext()) {
                System.out.print(iter.next());
                if (iter.hasNext())
                    System.out.print(" ");
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException occurred!");
        }

        // Shutdown the executor
        executor.shutdown();
    }

    private static void addRandomElements(OrderedListADT<Integer> list) {
        list.add(23);
        list.add(24);
        list.add(16);
        list.add(3);
        list.add(7);
        list.add(17);
        list.add(9);
        list.add(13);
        list.add(14);
        list.add(1);
    }
}
