package y1.s2.Modules.Module1.cse205_h01.h01.src;

// CLASS: H01_37
// AUTHOR: Eyad Mohamed AbdelMohsen Ghanem,
// your ASURITEID username,
// your email address

import java.util.ArrayList;

public class H01_37 {
    public static void arrayListRemove(ArrayList<Integer> pList, int pValue) {
        int index = 0;
        while (index < pList.size()) {
            if (pList.get(index) == pValue) {
                pList.remove(index);
            } else {
                index++;
            }
        }
    }
}
