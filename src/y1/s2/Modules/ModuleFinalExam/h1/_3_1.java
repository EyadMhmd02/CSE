package y1.s2.Modules.ModuleFinalExam.h1;

import java.util.ArrayList;

public class _3_1 {
    public int n;

    public static void main(String[] args) {
        ArrayList<Integer> list = arrayListInit();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println(sumArrayList(list));
    }

    public static ArrayList<Integer> arrayListInit() {
        ArrayList<Integer> list = new ArrayList<>();

        // 0 1 2 3 4 0 1 2 3 4
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        return list;
    }

    public static int sumArrayList(ArrayList<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return sum;
    }
}
