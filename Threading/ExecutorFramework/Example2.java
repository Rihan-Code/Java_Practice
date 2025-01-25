package Threading.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.*;

public class Example2  {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> submit = executorService.submit(() -> 1 + 4);
        Integer i = submit.get(); // this makes the main thread to process 
        System.out.println("Sum is: " + i);
        executorService.shutdown();
        // Thread.sleep(1000);
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated()); // it will return true when all the process gets ends after shutdown
    }
    
}
