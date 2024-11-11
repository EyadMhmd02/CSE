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
    public DoubleLinearNode<T> head, tail;

    // Node class for the doubly linked list
    static class DoubleLinearNode<T> {
        T data;
        public DoubleLinearNode<T> prev, next;

        /**
         * Constructs a new node with the given data.
         *
         * @param data The data to be stored in the node.
         */
        public DoubleLinearNode(T data) {
            this.data = data;
        }

        public void setPrevious(DoubleLinearNode<T> node) {
            this.prev = node;
        }

        public void setNext(DoubleLinearNode<T> node) {
            this.next = node;
        }
    }

    @Override
    public T removeFirst() {
        // Removes and returns the first element from the list.
        // Throws a NoSuchElementException if the list is empty.
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
        // Removes and returns the last element from the list.
        // Throws a NoSuchElementException if the list is empty.
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
        // Removes and returns the first occurrence of the specified element from the list.
        // Throws a NoSuchElementException if the list is empty or the element is not found.
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        DoubleLinearNode<T> current = head;
        while (current != null) {
            if (current.data.equals(element)) {
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
            current = current.next;
        }
        throw new NoSuchElementException("Element not found in the list");
    }

    @Override
    public T first() {
        // Returns the first element in the list.
        // Throws a NoSuchElementException if the list is empty.
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        return head.data;
    }

    @Override
    public T last() {
        // Returns the last element in the list.
        // Throws a NoSuchElementException if the list is empty.
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        return tail.data;
    }

    @Override
    public boolean contains(T target) {
        // Returns true if the list contains the specified element, false otherwise.
        // The implementation of this method is not provided in the given code.
        return false;
    }

    @Override
    public boolean isEmpty() {
        // Returns true if the list contains no elements, false otherwise.
        return count == 0;
    }

    @Override
    public int size() {
        // Returns the number of elements in the list.
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        // Returns an iterator over the elements in the list in proper sequence.
        return new Iterator<T>() {
            private DoubleLinearNode<T> current = head;

            @Override
            public boolean hasNext() {
                // Returns true if the iteration has more elements.
                return current != null;
            }

            @Override
            public T next() {
                // Returns the next element in the iteration.
                // Throws a NoSuchElementException if there is no more elements in the list.
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
        // Returns a string representation of the list.
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