package y3.s1.cse222.canvas.m07_priority_queues.canvas_impl;

/**
 * A MaxHeap class that implements a priority queue using a binary heap data structure.
 * The class supports insertion and deletion of the maximum element efficiently.
 *
 * @param <T> The type of elements to be stored in the priority queue.
 */
class MaxHeap<T extends Comparable<T>> {
    private T[] heap;
    private int size;

    /**
     * Constructs a new BinaryHeap with an initial capacity of 10.
     */
    public MaxHeap() {
        heap = (T[]) new Comparable[10];
        size = 0;
    }

    /**
     * Inserts a new element into the priority queue.
     *
     * @param value The element to be inserted.
     */
    public void insert(T value) {
        if (size == heap.length) {
            resize(heap.length * 2);
        }
        heap[++size] = value;
        swim(size);
    }

    /**
     * Removes and returns the maximum element from the priority queue.
     *
     * @return The maximum element.
     * @throws IllegalStateException If the priority queue is empty.
     */
    public T delMax() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }
        T max = heap[1];
        exch(1, size--);
        heap[size + 1] = null;
        sink(1);
        if (size > 0 && size == heap.length / 4) {
            resize(heap.length / 2);
        }
        return max;
    }

    /**
     * Checks if the priority queue is empty.
     *
     * @return True if the priority queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the number of elements in the priority queue.
     *
     * @return The number of elements in the priority queue.
     */
    public int size() {
        return size;
    }

    /**
     * Prints the elements of the priority queue in the current order.
     */
    public void printHeap() {
        System.out.print("[ ");
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.print("]\n");
    }

    // Helper methods for maintaining the heap property

    /**
     * Helper method to maintain the heap property by moving an element up the heap (swim).
     * This method compares the element at index k with its parent and swaps them if necessary.
     * The process continues until the heap property is satisfied or the root is reached.
     *
     * @param k The index of the element to be swum.
     */
    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exch(k / 2, k);
            k = k / 2;
        }
    }

    /**
     * Helper method to maintain the heap property by moving an element down the heap (sink).
     * This method compares the element at index k with its children and swaps them if necessary.
     * The process continues until the heap property is satisfied or the element has no children.
     *
     * @param k The index of the element to be sunk.
     */
    private void sink(int k) {
        while (2 * k <= size) {
            int j = 2 * k;
            if (j < size && less(j, j + 1)) {
                j++;
            }
            if (!less(k, j)) {
                break;
            }
            exch(k, j);
            k = j;
        }
    }

    /**
     * Checks if the element at index i is less than the element at index j.
     *
     * @param i The index of the first element.
     * @param j The index of the second element.
     * @return True if the element at index i is less than the element at index j, false otherwise.
     */
    private boolean less(int i, int j) {
        return heap[i].compareTo(heap[j]) < 0;
    }

    /**
     * Swaps the elements at indices i and j in the heap.
     *
     * @param i The index of the first element.
     * @param j The index of the second element.
     */
    private void exch(int i, int j) {
        T temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    /**
     * Resizes the heap to the specified new capacity.
     *
     * @param newCapacity The new capacity of the heap.
     */
    private void resize(int newCapacity) {
        T[] temp = (T[]) new Comparable[newCapacity];
        for (int i = 1; i <= size; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }
}