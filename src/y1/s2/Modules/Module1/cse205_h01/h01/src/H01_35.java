package y1.s2.Modules.Module1.cse205_h01.h01.src;

// CLASS: H01_35
// AUTHOR: Eyad Mohamed AbdelMohsen Ghanem,
// your ASURITEID username,
// your email address

import java.util.ArrayList;

public class H01_35 {
    ArrayList<Integer> arrayListCreate(int pLen, int pInitValue) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < pLen; i++) {
            list.add(pInitValue);
        }
        return list;
    }
}
