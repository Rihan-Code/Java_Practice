package Threading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

// Was introduced in Java 8, used for Asynchronous Programming
public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException{
        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);;
                System.out.println("Task1");
            } catch (Exception e) {

            }
            return "Ok";
        });
        
        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);;
                System.out.println("Task2");
            } catch (Exception e) {

            }
            return "Ok";
        });
        
        // Returns a new CompletableFuture that is completed when all of the given CompletableFutures complete. If any of the give CopletableFutures complete exceptionally then the returned CompletableFuture also does so, with a CompletionException holding this exveption as its cause.
        CompletableFuture<Void> tasks = CompletableFuture.allOf(task1, task2);
        tasks.join();
        System.out.println("Main");
    }
}
