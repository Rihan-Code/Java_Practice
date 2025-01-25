package Threading.ExecutorFramework;

import java.util.concurrent.*;

public class CyclicBarrierExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfServices = 3;

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);

        // CyclicBarrier does not block the main thread. It ensures that all threads reach a certain point before proceeding or exiting.
        // CyclicBarrier is reusable, unlike CountDownLatch
        CyclicBarrier barrier = new CyclicBarrier(numberOfServices, () -> {
            System.out.println("All services have reached the barrier.");
        });

        Future<String> future1 = executorService.submit(new DependentService(barrier));
        Future<String> future2 = executorService.submit(new DependentService(barrier));
        Future<String> future3 = executorService.submit(new DependentService(barrier));

        // Wait for all tasks to complete
        future1.get();
        future2.get();
        future3.get();

        System.out.println("Main thread execution completed.");
        executorService.shutdown();
    }
}

class DependentService implements Callable<String> {
    private final CyclicBarrier barrier;

    public DependentService(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " service started.");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " is waiting at the barrier...");
        barrier.await();

        return "Ok";
    }
}