package y3.s1;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.list_handler.ListHandler;
import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.stopwatch.Stopwatch;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();

        ArrayList<Integer> list = ListHandler.createList();
        ListHandler.populateListWithRandomNumbers(list, 300000000, 5);
        list.add(9);

        int n = list.size();
        System.out.println("n = " + n);

        stopwatch.reset();
        for (int i = 0; i < n; i++) {
            if (list.get(i) == 9) {
                System.out.println("Found");
            }
        }
        System.out.println(stopwatch);
    }
}
