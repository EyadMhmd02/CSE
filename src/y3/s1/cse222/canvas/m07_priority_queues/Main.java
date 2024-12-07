package y3.s1.cse222.canvas.m07_priority_queues;

import java.util.ArrayList;
import java.util.Collections;

// BinaryHeap Class
class BinaryHeap {
    private ArrayList<Integer> heap;

    public BinaryHeap() {
        heap = new ArrayList<>();
    }

    // Helper function to move an element up (swim)
    private void swim(int k) {
        while (k > 0 && heap.get((k - 1) / 2) < heap.get(k)) {
            Collections.swap(heap, k, (k - 1) / 2);
            k = (k - 1) / 2;
        }
    }

    // Helper function to move an element down (sink)
    private void sink(int k) {
        int n = heap.size();
        while (2 * k + 1 < n) {
            int j = 2 * k + 1; // Left child
            if (j + 1 < n && heap.get(j) < heap.get(j + 1)) {
                j++; // Right child is larger
            }
            if (heap.get(k) >= heap.get(j)) break;
            Collections.swap(heap, k, j);
            k = j;
        }
    }

    // Insert an element into the heap
    public void insert(int value) {
        heap.add(value);
        swim(heap.size() - 1);
    }

    // Remove and return the maximum element
    public int delMax() {
        if (heap.isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }
        int maxValue = heap.get(0);
        Collections.swap(heap, 0, heap.size() - 1);
        heap.remove(heap.size() - 1);
        sink(0);
        return maxValue;
    }

    // Check if the heap is empty
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    // Get the size of the heap
    public int size() {
        return heap.size();
    }

    // Print the heap (for debugging)
    public void printHeap() {
        System.out.println(heap);
    }
}

// PriorityQueue Class
class PriorityQueue {
    private BinaryHeap binaryHeap; // Using BinaryHeap as the internal structure

    public PriorityQueue() {
        binaryHeap = new BinaryHeap();
    }

    // Insert an element with priority
    public void enqueue(int value) {
        binaryHeap.insert(value);
    }

    // Remove and return the element with the highest priority
    public int dequeue() {
        return binaryHeap.delMax();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return binaryHeap.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return binaryHeap.size();
    }

    // Print the elements in the queue (for debugging)
    public void printQueue() {
        binaryHeap.printHeap();
    }
}

// Main function to demonstrate the classes
public class Main {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.enqueue(10);
        pq.enqueue(20);
        pq.enqueue(5);
        pq.enqueue(30);
        pq.enqueue(15);

        System.out.println("Priority Queue elements: ");
        pq.printQueue();

        System.out.println("Dequeued: " + pq.dequeue()); // Should return 30
        System.out.println("Dequeued: " + pq.dequeue()); // Should return 20
        System.out.println("Dequeued: " + pq.dequeue()); // Should return 15
        System.out.println("Dequeued: " + pq.dequeue()); // Should return 10
        System.out.println("Dequeued: " + pq.dequeue()); // Should return 5

        System.out.println("Priority Queue elements after dequeuing: ");
        pq.printQueue();
    }
}
