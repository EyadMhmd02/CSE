package y3.s1.cse222.canvas.m07_priority_queues;

import java.util.NoSuchElementException;

/**
 * A class representing a max priority queue using a binary heap.
 *
 * @param <Key> The type of elements to be stored in the priority queue.
 *              Must implement the Comparable interface.
 */
public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N = 0;

    /**
     * Initializes an empty max priority queue with capacity maxN.
     *
     * @param maxN The maximum capacity of the priority queue.
     */
    public MaxPQ(int maxN) {
        pq = (Key[]) new Comparable[maxN + 1];
    }

    /**
     * Checks if the priority queue is empty.
     *
     * @return True if the priority queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * Returns the number of elements in the priority queue.
     *
     * @return The number of elements in the priority queue.
     */
    public int size() {
        return N;
    }

    /**
     * Inserts a new key into the priority queue.
     *
     * @param v The key to be inserted.
     */
    public void insert(Key v) {
        pq[++N] = v;
        swim(N);
    }

    /**
     * Removes and returns the maximum key from the priority queue.
     *
     * @return The maximum key from the priority queue.
     * @throws NoSuchElementException if the priority queue is empty.
     */
    public Key delMax() {
        if (isEmpty()) throw new NoSuchElementException("Priority queue underflow");
        Key max = pq[1];
        exch(1, N--);
        pq[N + 1] = null;
        sink(1);
        return max;
    }

    // Helper functions

    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exch(k, k / 2);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(j, j + 1)) j++;
            if (!less(k, j)) break;
            exch(k, j);
            k = j;
        }
    }

    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    private void exch(int i, int j) {
        Key swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;
    }
}