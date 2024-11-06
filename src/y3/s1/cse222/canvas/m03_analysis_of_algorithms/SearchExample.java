package y3.s1.cse222.canvas.m03_analysis_of_algorithms;

import java.util.ArrayList;

class SearchExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = ListHandler.createList();

        ListHandler.populateListWithRandomNumbers(list, Integer.MAX_VALUE / 5);

        int key = ListHandler.setKey(list);

        SearchHandler.printSearchResult(key, list);
    }
}
