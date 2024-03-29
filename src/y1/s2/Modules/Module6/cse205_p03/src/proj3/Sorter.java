package y1.s2.Modules.Module6.cse205_p03.src.proj3;

import java.util.ArrayList;

public class Sorter {
    private static int partition(ArrayList<Student> pList, int pFromIdx, int pToIdx) {
        Student pivot = pList.get(pFromIdx);
        int leftIdx = pFromIdx - 1, rightIdx = pToIdx + 1;
        while (leftIdx < rightIdx) {
            ++leftIdx;
            while (pList.get(leftIdx).compareTo(pivot) < 0) ++leftIdx;
            --rightIdx;
            while (pList.get(rightIdx).compareTo(pivot) > 0) --rightIdx;
            if (leftIdx < rightIdx) swap(pList, leftIdx, rightIdx);
        }
        return rightIdx;
    }

    private static void quickSort(ArrayList<Student> pList, int pFromIdx, int pToIdx) {
        if (pFromIdx >= pToIdx) return;
        int partitionIdx = partition(pList, pFromIdx, pToIdx);
        quickSort(pList, pFromIdx, partitionIdx);
        quickSort(pList, partitionIdx + 1, pToIdx);
    }

    public static void sort(ArrayList<Student> pList) {
        quickSort(pList, 0, pList.size() - 1);
    }

    public static void swap(ArrayList<Student> pList, int pIdx1, int pIdx2) {
        Student temp = pList.get(pIdx1);
        pList.set(pIdx1, pList.get(pIdx2));
        pList.set(pIdx2, temp);
    }
}
