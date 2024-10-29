package y1.s2.Modules.Module6.cse205_src_mod_06.linked_list;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(int index, int data) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();

        if (index == size) { // appending
            Node newNode = new Node(data, tail, null);

            if (size == 0) head = newNode;
            else tail.next = newNode;

            tail = newNode;
        } else { // not appending
            Node currentNode = getNodeAt(index);
            Node newNode = new Node(data, currentNode.prev, currentNode);

            if (index != 0) currentNode.prev.next = newNode;
            currentNode.prev = newNode;

            if (index == 0) head = newNode;
        }

        size++;
    }

    public void append(int data) {
        add(size, data);
    }

    public void prepend(int data) {
        add(0, data);
    }

    public void clear() {
        while (!isEmpty()) {
            remove(0);
        }
    }

    public int remove(int index) {
        Node node = getNodeAt(index);

        if (size == 1) {
            head = null;
            tail = null;
        } else if (index == 0) {
            node.next.prev = null;
            head = node.next;
        } else if (index == size - 1) {
            tail.prev.next = null;
            tail = node.prev;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        size--;

        return node.data;
    }

    public int set(int index, int data) {
        Node node = getNodeAt(index);
        node.data = data;
        return node.data;
    }

    public int get(int index) throws IndexOutOfBoundsException {
        return getNodeAt(index).data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    protected Node getNodeAt(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        if (index == 0) return head;
        else if (index == size - 1) return tail;

        Node node = head.next; // 1
        for (int i = 1; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public void print(LinkedList llist) {
        for (int i = 0; i < llist.size; i++) {
            System.out.print(llist.getNodeAt(i).data + " ");
        }
    }

    protected static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}
