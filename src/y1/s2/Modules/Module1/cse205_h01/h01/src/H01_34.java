package y1.s2.Modules.Module1.cse205_h01.h01.src;

// CLASS: H01_34
// AUTHOR: Eyad Mohamed AbdelMohsen Ghanem,
// your ASURITEID username,
// your email address

import java.util.ArrayList;

public class H01_34 {
    public Integer arrayListSum(ArrayList<Integer> pList) {
        if (pList == null)
            return 0;

        Integer total = 0;
        for (Integer element : pList) {
            total += element;
        }
        return total;
    }
}
