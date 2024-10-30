package y1.s2.Modules.Module6.cse205_h03.src._5;

import java.util.ArrayList;
import java.util.List;

public class _5_7 {
    public static void main(String[] args) {
        testRecTernarySearch();
    }

    static int recTernarySearch(ArrayList<Integer> pList, Integer pKey, int pLow, int pHigh) {
        if (pLow > pHigh) return -1;
        int range = pHigh - pLow;
        int oneThirdIdx = (int) Math.round(pLow + range / 3.0);
        int twoThirdIdx = (int) Math.round(pLow + range / 1.33);
        if (pKey.equals(pList.get(oneThirdIdx))) {
            return oneThirdIdx;
        } else if (pKey < pList.get(oneThirdIdx)) {
            return recTernarySearch(pList, pKey, pLow, oneThirdIdx - 1);
        } else if (pKey > pList.get(twoThirdIdx)) {
            return recTernarySearch(pList, pKey, twoThirdIdx + 1, pHigh);
        } else {
            return recTernarySearch(pList, pKey, oneThirdIdx + 1, twoThirdIdx - 1);
        }
    }

    static void testRecTernarySearch() {
        ArrayList<Integer> list = new ArrayList<>(List.of(2, 3, 5, 10, 16, 24, 32, 48, 96, 120, 240, 360, 800, 1600));
        int key = 10;
        System.out.println(recTernarySearch(list, key, 0, list.size() - 1));
    }
}
