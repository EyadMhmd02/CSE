package y3.s1.cse222.canvas.m07_priority_queues.canvas_impl;

public class PriorityQueueTest {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
//
//        pq1.enqueue(1);
//        pq1.enqueue(3);
//        pq1.enqueue(2);
//
//        pq1.printQueue(); // Output: 3 1 2
//
//        pq1.dequeue();
//        pq1.printQueue(); // Output: 2 1
//
//        pq1.dequeue();
//        pq1.printQueue(); // Output: 1

        PriorityQueue<String> pq2 = new PriorityQueue<>();

        pq2.enqueue("apple");  // 4
        pq2.enqueue("eyad");   // 1
        pq2.enqueue("cherry"); // 3
        pq2.enqueue("banana"); // 2

        pq2.printQueue(); // Output: eyad banana cherry apple

        pq2.dequeue();
        pq2.printQueue(); // Output: cherry banana apple

        pq2.enqueue("omar");
        pq2.printQueue(); // Output: omar cherry banana apple

        pq2.enqueue("malika");
        pq2.printQueue(); // Output: omar malika cherry banana apple
    }
}
