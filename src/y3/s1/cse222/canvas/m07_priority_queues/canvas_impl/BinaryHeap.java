package y3.s1.cse222.canvas.m07_priority_queues.canvas_impl;

class BinaryHeap<T extends Comparable<T>> {
    private T[] heap;
    private int size;

    public BinaryHeap() {
        heap = (T[]) new Comparable[10];
        size = 0;
    }

    public void insert(T value) {
        if (size == heap.length) {
            resize(heap.length * 2);
        }
        heap[++size] = value;
        swim(size);
    }

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

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void printHeap() {
        System.out.print("[ ");
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.print("]\n");
    }

    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exch(k / 2, k);
            k = k / 2;
        }
    }

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

    private boolean less(int i, int j) {
        return heap[i].compareTo(heap[j]) < 0;
    }

    private void exch(int i, int j) {
        T temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void resize(int newCapacity) {
        T[] temp = (T[]) new Comparable[newCapacity];
        for (int i = 1; i <= size; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }
}