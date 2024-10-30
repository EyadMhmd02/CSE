package y1.s2.Modules.ModuleFinalExam.h1;

import java.util.ArrayList;

public class _3_6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Eyad");
        names.add("Ibrahim");
        names.add("Malika");
        names.add("Mohsen");

        insertName(names, "Omar");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " ");
        }
    }

    public static void insertName(ArrayList<String> list, String name) {
        boolean inserted = false;

        for (int i = 0; i < list.size(); i++) {
            if (name.compareTo(list.get(i)) < 0) {
                list.add(i, name);
                inserted = true;
                break;
            }
        }

        if (!inserted) {
            list.add(name);
        }
    }
}
