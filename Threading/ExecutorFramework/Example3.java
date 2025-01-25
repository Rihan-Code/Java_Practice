package Threading.ExecutorFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example3  {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorsService = Executors.newFixedThreadPool(2);

        Callable<Integer> callable1 = () -> {
            System.out.println("Task1");
            return 1;
        };
        Callable<Integer> callable2 = () -> {
            System.out.println("Task2");
            return 2;
        };
        Callable<Integer> callable3 = () -> {
            System.out.println("Task3");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);

        List<Future<Integer>> futures = executorsService.invokeAll(list); // this also blocks the main thread to wait for all the tasks to complete
        for(Future<Integer> future : futures) {
            System.out.println(future.get());
        } 
        executorsService.shutdown();
    }
}
