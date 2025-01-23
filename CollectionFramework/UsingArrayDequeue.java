package CollectionFramework;

import java.util.ArrayDeque;

public class UsingArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(33);
        stack.push(11);
        stack.push(3);
        stack.push(35);
        stack.push(5);

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.poll());
        }
    }
}
