package Threading.ExecutorFramework;

import java.util.concurrent.*;

public class SchedularExecutorServiceExamples {
   public static void main(String[] args) {
        ScheduledExecutorService schedular = Executors.newScheduledThreadPool(1);

        // schedular.schedule(() -> System.out.println("Task executed after 5 seconds delay!"), 5, TimeUnit.SECONDS);
        schedular.scheduleAtFixedRate(() -> System.out.println("Task executed after every 5 seconds, 5 times"), 5, 5, TimeUnit.SECONDS);

        // this means that how long to wait after completing a task to start the next task
        schedular.scheduleWithFixedDelay(
            () -> System.out.println("Task executed after every 5 seconds, 5 times"), 
            5, 
            5,
            TimeUnit.SECONDS);
        // schedular.shutdown();   // this will shutdown the schedular instantly due to which the schedualr will not get the time to execute the task
        // therefore following has to be done: 
        schedular.schedule(() -> {
            System.out.println("Initiating shutdown...");
            schedular.shutdown();
        }, 20, TimeUnit.SECONDS); // this will shutdown our schedular after 20 seconds


   }
}
