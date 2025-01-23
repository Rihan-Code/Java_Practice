package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class UsingLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(80);
        nums.add(75);
        nums.add(123);
        nums.add(193);
        nums.add(333);
        
        nums.add(3, 783);
        System.out.println("Nums: " + nums);

        nums.remove(2);

        for(int num : nums) {
            System.out.println(num);
        }

        // LinkedList can be used as Queue
        LinkedList<String> queue = new LinkedList<>();
        
        // enque
        queue.addLast("Task1");
        queue.addLast("Task2");
        queue.addLast("Task3");
        queue.addLast("Task4");
        queue.addLast("Task5");
        System.out.println("Queued tasks are: " + queue);

        // dequeue
        System.out.println("Processing... " + queue.removeFirst());
        System.out.println("Processing... " + queue.removeFirst());
    }
}
