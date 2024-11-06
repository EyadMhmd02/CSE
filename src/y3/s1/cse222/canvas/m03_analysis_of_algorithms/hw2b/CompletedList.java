package y3.s1.cse222.canvas.m03_analysis_of_algorithms.hw2b;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * CompletedList represents an implementation of a list.
 *
 * @author Eyad Mohamed AbdelMohsen Ghanem
 * @version 1.0
 */
class CompletedList<T> implements ListADT<T>, Iterable<T> {
    //The following three variables are a suggested start if you are using a list implementation.
    protected int count;
    protected int modChange;
    protected DoubleLinearNode<T> head, tail;

    // Node class for the doubly linked list
    static class DoubleLinearNode<T> {
        T data;
        DoubleLinearNode<T> prev;
        DoubleLinearNode<T> next;

        public DoubleLinearNode(T data) {
            this.data = data;
        }
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
        // Implement remove method here
        return null;
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
        // Implement contains method here
        return false;
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
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private DoubleLinearNode<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("No more elements in the list");
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
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