package y3.s1.cse222.canvas.m07_priority_queues.canvas_impl;

// PriorityQueue Class
class PriorityQueue<T extends Comparable<T>> {
    private MaxHeap<T> maxHeap; // Using BinaryHeap as the internal structure

    public PriorityQueue() {
        maxHeap = new MaxHeap<>();
    }

    // Insert an element with priority
    public void enqueue(T value) {
        maxHeap.insert(value);
    }

    // Remove and return the element with the highest priority
    public T dequeue() {
        return maxHeap.delMax();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return maxHeap.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return maxHeap.size();
    }

    // Print the elements in the queue (for debugging)
    public void printQueue() {
        maxHeap.printHeap();
    }
}