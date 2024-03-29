package y1.s2.Modules.Module6.cse205_src_mod_06.queue;

import y1.s2.Modules.Module6.cse205_src_mod_06.linked_list.LinkedList;

public class Queue {
    private LinkedList list;

    public Queue() {
        this.list = new LinkedList();
    }

    public void clear() {
        list.clear();
    }

    public int dequeue() {
        int front = list.remove(0);
        return front;
    }

    public void enqueue(int data) {
        list.append(data);
    }

    public LinkedList getList() {
        return list;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int peek() {
        return list.get(0);
    }

    public void setList(LinkedList list) {
        this.list = list;
    }
}
