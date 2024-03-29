package y1.s2.Modules.Module1.cse205_h01.h01.src;

// CLASS: H01_36
// AUTHOR: Eyad Mohamed AbdelMohsen Ghanem,
// your ASURITEID username,
// your email address

import java.util.ArrayList;

public class H01_36 {
    public static void insertName(ArrayList<String> pList, String pName) {
        boolean inserted = false;
        for (int index = 0; !inserted && index < pList.size(); index++) {
            if (pName.compareTo(pList.get(index)) < 0) {
                pList.add(index, pName);
                inserted = true;
            }
        }
        if (!inserted) {
            pList.add(pName);
        }
    }
}
