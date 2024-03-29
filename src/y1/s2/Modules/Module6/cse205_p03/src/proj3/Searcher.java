package y1.s2.Modules.Module6.cse205_p03.src.proj3;

import java.util.ArrayList;

public class Searcher {
    public static int search(ArrayList<Student> pList, String pKey) {
        int low = 0, high = pList.size() - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            int compare = pKey.compareTo(pList.get(middle).getLastName());
            if (compare == 0) {
                return middle;
            } else if (compare < 0) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1; // Not found
    }
}
