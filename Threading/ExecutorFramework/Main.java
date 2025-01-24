package Threading.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // Thread[] threads = new Thread[9]; // multiple threads, made manually
        ExecutorService executor = Executors.newFixedThreadPool(3); // for creating thread pool 
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e); // blocks until all the threads to get executed
        }
        System.out.println("Toal time: " + (System.currentTimeMillis() - startTime));
    }

    private static long factorial(int n) {
        long result = 1;
        for(int i=1; i<=n; i++) {
            result *= i;
        }
        return result;
    }
}
