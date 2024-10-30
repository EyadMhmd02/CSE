package y1.s2.Modules.Module6.cse205_src_mod_06.linked_list;

public class Test {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.add(0, 4);
        llist.append(6);
        llist.append(7);
        llist.add(2, 5);

        llist.print(llist);
    }
}
