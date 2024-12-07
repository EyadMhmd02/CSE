package y3.s1.cse222.canvas.m07_priority_queues;

import y3.s1.cse222.canvas.m03_analysis_of_algorithms.analysis.stopwatch.Stopwatch;

import java.util.Random;

public class MaxPQTest {
    public static void main(String[] args) {
        int size = 99999999; // حجم البيانات
        MaxPQ<Integer> pq = new MaxPQ<>(size);

        // إنشاء كائن Stopwatch
        Stopwatch stopwatch = new Stopwatch();

        System.out.println("Inserting elements into Priority Queue...");

        // إدخال عناصر عشوائية
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            pq.insert(random.nextInt(size));
        }

        System.out.println("All elements inserted.");
        System.out.println(stopwatch);

        stopwatch.reset();
        System.out.println("Removing elements from Priority Queue...");

        // حذف جميع العناصر
        while (!pq.isEmpty()) {
            pq.delMax();
        }

        System.out.println("All elements removed.");
        System.out.println(stopwatch);
    }
}

/*
Inserting elements into Priority Queue...
All elements inserted.
Elapsed time:	000:00:00:12:001

Removing elements from Priority Queue...
All elements removed.
Elapsed time:	000:00:05:06:589
*/