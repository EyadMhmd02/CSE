package y3.s1.cse222.canvas.m07_priority_queues.canvas_impl;

import y1.s2.Modules.Module6.cse205_src_mod_06.Queue;

public class PriorityQueueTest {
    public static void main(String[] args) {
//        Queue q1 = new Queue();
//
//        q1.enqueue(1);
//        q1.enqueue(0);
//        q1.enqueue(3);
//        q1.enqueue(6);
//        q1.enqueue(2);
//        q1.enqueue(9);
//
//        System.out.println("Queue");
//        System.out.println(q1); // 1 0 3 6 2 9
//
//        q1.dequeue();
//        System.out.println(q1); // 0 3 6 2 9
//
//        q1.enqueue(10);
//        System.out.println(q1); // 0 3 6 2 9 10
//
//        q1.enqueue(4);
//        System.out.println(q1); // 0 3 6 2 9 10 4

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();

        pq1.enqueue(1);
        pq1.enqueue(0);
        pq1.enqueue(3);
        pq1.enqueue(6);
        pq1.enqueue(2);
        pq1.enqueue(9);

        System.out.println("Priority Queue");
        pq1.printQueue(); // 9 3 6 0 2 1

        pq1.dequeue();
        pq1.printQueue(); // 6 3 1 0 2

        pq1.enqueue(10);
        pq1.printQueue(); // 10 3 6 0 2 1

        pq1.enqueue(4);
        pq1.printQueue(); // 10 3 6 0 2 1 4

        pq1.dequeue();
        pq1.printQueue(); // 6 3 4 0 2 1

        pq1.dequeue();
        pq1.printQueue(); // 4 3 1 0 2

        pq1.enqueue(3);
        pq1.printQueue(); // 4 3 3 0 2 1

        pq1.enqueue(100);
        pq1.printQueue(); // 100 3 4 0 2 1 3

//        PriorityQueue<String> pq2 = new PriorityQueue<>();
//
//        pq2.enqueue("apple");  // 4
//        pq2.enqueue("eyad");   // 1
//        pq2.enqueue("cherry"); // 3
//        pq2.enqueue("banana"); // 2
//
//        pq2.printQueue(); // Output: eyad banana cherry apple
//
//        pq2.dequeue();
//        pq2.printQueue(); // Output: cherry banana apple
//
//        pq2.enqueue("omar");
//        pq2.printQueue(); // Output: omar cherry banana apple
//
//        pq2.enqueue("malika");
//        pq2.printQueue(); // Output: omar malika cherry banana apple
    }
}
