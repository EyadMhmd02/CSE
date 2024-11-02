package y3.s1.cse222.canvas.m03_analysis_of_algorithms.hw2b;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/**
 * CompletedOrderedList testing area.
 *
 * @author Eyad Mohamed AbdelMohsen Ghanem
 * @version (version)
 */
//class Driver {
//    public static void main(String [] args) {
//        //ListADT<Integer> list = new CompletedList<>(); //simpler version
//        OrderedListADT<Integer> list = new CompletedOrderedList<>();
//
//        //RA: These are _extremely_ simple tests! You will need to write more!
//
//        list.add(23);
//        list.add(24);
//        list.add(16);
//        list.add(3);
//        list.add(7);
//        list.add(17);
//        list.add(9);
//        list.add(13);
//        list.add(14);
//        list.add(1);
//
//        System.out.println(list);
//
//        list.remove(7);
//        list.removeFirst();
//        list.remove(17);
//        list.removeLast();
//        list.remove(14);
//        list.removeLast();
//
//        System.out.println(list);
//
//        /* Test Results:
//            1 3 7 9 13 14 16 17 23 24
//            3 9 13 16
//        */
//
//        Iterator<Integer> iter = list.iterator();
//        while(iter.hasNext()) {
//            System.out.print(iter.next());
//            if (iter.hasNext())
//                System.out.print(" ");
//        }
//
//        // RA: You should definitely write a test for ConcurrentModificationException...
//
//    }
//}
