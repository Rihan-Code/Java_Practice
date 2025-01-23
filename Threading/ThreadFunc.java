package Threading;

public class ThreadFunc extends Thread {
    @Override
    public void run() {
        System.out.println("Running");
        try {
            Thread.sleep(2000); // timed waiting state for 2 seconds
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadFunc t1 = new ThreadFunc();
        System.out.println(t1.getState());
        t1.start(); // the thread starts executing
        System.out.println();
        Thread.sleep(1000); // timed waiting state for 1 second 
        System.out.println(t1.getState());
        t1.join(); // main thread waits for t1 to finish
        System.out.println(t1.getState());
        
    }
}
