package y1.s2.Modules.Module6.cse205_src_mod_06.stack;

import y1.s2.Modules.Module6.cse205_src_mod_06.linked_list.LinkedList;

public class Stack {
    private LinkedList list;

    public Stack() {
        this.list = new LinkedList();
    }

    public void clear() {
        list.clear();
    }

    public LinkedList getList() {
        return list;
    }

    public int peek() {
        return list.get(0);
    }

    public int pop() {
        int top = list.remove(0);
        return top;
    }

    public void push(int data) {
        list.prepend(data);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void setList(LinkedList list) {
        this.list = list;
    }
}
