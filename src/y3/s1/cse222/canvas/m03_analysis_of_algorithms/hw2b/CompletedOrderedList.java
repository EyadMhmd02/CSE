package y3.s1.cse222.canvas.m03_analysis_of_algorithms.hw2b;

import java.util.NoSuchElementException;

/**
 * CompletedOrderedList represents an implementation of an ordered list that builds on
 * CompletedList.
 *
 * @author Eyad Mohamed AbdelMohsen Ghanem
 * @version 1.0
 */
class CompletedOrderedList<T extends Comparable<T>> extends CompletedList<T>
        implements OrderedListADT<T> {

    @Override
    public void add(T element) {
        DoubleLinearNode<T> newNode = new DoubleLinearNode<>(element);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else if (element.compareTo(head.data) <= 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (element.compareTo(tail.data) >= 0) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoubleLinearNode<T> current = head;
            while (current.next != null && element.compareTo(current.next.data) > 0) {
                current = current.next;
            }
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        count++;
        modChange++;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        head = head.next;
        count--;
        modChange++;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        return null;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        tail = tail.prev;
        count--;
        modChange++;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        return null;
    }

    @Override
    public T remove(T element) {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        DoubleLinearNode<T> current = head;
        while (current != null && current.data.compareTo(element) != 0) {
            current = current.next;
        }
        if (current == null) {
            throw new NoSuchElementException("Element not found in the list");
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }
        count--;
        modChange++;
        return current.data;
    }

    @Override
    public T first() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        return head.data;
    }

    @Override
    public T last() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        return tail.data;
    }

    @Override
    public boolean contains(T target) {
        DoubleLinearNode<T> current = head;
        while (current != null && current.data.compareTo(target) != 0) {
            current = current.next;
        }
        return current != null;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        DoubleLinearNode<T> current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
