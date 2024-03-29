package y1.s2.Modules.Module1.cse205_h01.h01.src;

// CLASS: H01_31
// AUTHOR: Eyad Mohamed AbdelMohsen Ghanem,
// your ASURITEID username,
// your email address

import java.util.ArrayList;

public class H01_31 {
    public H01_31() {
    }

    public ArrayList<Integer> arrayListInit() {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        return list;
    }
}