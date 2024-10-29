package y1.s2.Modules.Module6.cse205_h03.src._4;

import java.util.ArrayList;
import java.util.List;

public class _4_1 {
    public static void main(String[] args) {
        testRecLinearSearch();
    }

    static int recLinearSearch(ArrayList<String> pList, int pBeginIdx, int pEndIdx, String pKey) {
        if (pBeginIdx > pEndIdx) {
            return -1;
        } else if (pList.get(pBeginIdx).equals(pKey)) {
            return pBeginIdx;
        } else {
            return recLinearSearch(pList, pBeginIdx + 1, pEndIdx, pKey);
        }
    }

    static void testRecLinearSearch() {
        ArrayList<String> list = new ArrayList<>(List.of("Umar", "Eyad", "Mohamed", "Sarah", "Malika"));
        System.out.println(recLinearSearch(list, 0, list.size() - 1, "Malika"));
    }
}
