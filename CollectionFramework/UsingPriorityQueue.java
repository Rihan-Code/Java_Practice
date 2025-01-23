package CollectionFramework;

import java.util.PriorityQueue;

class Task {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + " (Priority:" + priority + ")";
    }
}

public class UsingPriorityQueue {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // pq.add(10);
        // pq.add(20);
        // pq.add(15);
        // pq.add(5);
        // pq.add(25);
        // pq.add(30);
        // pq.add(2);
        // pq.add(1);

        // System.out.println("Priority Queue: " + pq);
        // System.out.println("\nPeek: " + pq.peek());
        // System.out.println("Poll: " + pq.poll());
        // System.out.println("After Poll: " + pq);

        // while (!pq.isEmpty()) {
        //     System.out.println("Processing... " + pq.poll()); // retrieves and remove the head of the queue           
        // }

        PriorityQueue<Task> taskQueue = new PriorityQueue<>((t1, t2) -> t2.priority - t1.priority);
        taskQueue.add(new Task("Task1", 1));
        taskQueue.add(new Task("Task2", 3));
        taskQueue.add(new Task("Task3", 2));

        while (!taskQueue.isEmpty()) {
            System.out.println("Processing... " + taskQueue.poll());
        }
    }
}
