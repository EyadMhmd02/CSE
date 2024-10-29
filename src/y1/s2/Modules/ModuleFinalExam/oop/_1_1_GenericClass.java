package y1.s2.Modules.ModuleFinalExam.oop;

import java.util.ArrayList;

public class _1_1_GenericClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(4);
        list.add(6);
        list.remove(0);
        System.out.println(list.get(0));
        list.set(0, 5);
        System.out.println(list.get(0));
        System.out.println(list.size());
    }
}
